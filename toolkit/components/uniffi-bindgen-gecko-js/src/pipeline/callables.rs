/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

use super::*;
use crate::ConcrrencyMode;

use anyhow::{anyhow, Result};

pub fn pass(module: &mut Module) -> Result<()> {
    let async_wrappers = module.config.async_wrappers.clone();
    let module_name = module.name.clone();
    let crate_name = module.crate_name.clone();

    // Track unconfigured callables for later reporting
    let mut unconfigured_callables = Vec::new();

    module.visit_mut(|callable: &mut Callable| {
        if callable.async_data.is_some() {
            callable.is_js_async = true;
            callable.uniffi_scaffolding_method = "UniFFIScaffolding.callAsync".to_string();
            return;
        }

        let name = &callable.name;
        let spec = match &callable.kind {
            CallableKind::Function => name.clone(),
            CallableKind::Method { interface_name, .. }
            | CallableKind::VTableMethod {
                trait_name: interface_name,
            }
            | CallableKind::Constructor { interface_name, .. } => {
                format!("{interface_name}.{name}")
            }
        };

        // Check if this callable has explicit configuration
        match async_wrappers.get(&spec) {
            Some(ConcrrencyMode::Sync) => {
                callable.is_js_async = false;
                callable.uniffi_scaffolding_method = "UniFFIScaffolding.callSync".to_string();
            }
            Some(ConcrrencyMode::AsyncWrapped) => {
                callable.is_js_async = true;
                callable.uniffi_scaffolding_method =
                    "UniFFIScaffolding.callAsyncWrapper".to_string();
            }
            None => {
                // Store information about the unconfigured callable
                let source_info = match &callable.kind {
                    CallableKind::Function => {
                        format!("Function '{}' in module '{}'", name, module_name)
                    }
                    CallableKind::Method { interface_name, .. } => format!(
                        "Method '{}.{}' in module '{}'",
                        interface_name, name, module_name
                    ),
                    CallableKind::Constructor { interface_name, .. } => format!(
                        "Constructor '{}.{}' in module '{}'",
                        interface_name, name, module_name
                    ),
                    CallableKind::VTableMethod { trait_name } => format!(
                        "VTable method '{}.{}' in module '{}'",
                        trait_name, name, module_name
                    ),
                };

                unconfigured_callables.push((spec.clone(), source_info));

                // Default to async for now - this won't matter if we fail the build
                callable.is_js_async = true;
                callable.uniffi_scaffolding_method =
                    "UniFFIScaffolding.callAsyncWrapper".to_string();
            }
        }
    });

    // Report unconfigured callables
    if !unconfigured_callables.is_empty() {
        let mut message = format!(
            "Found {} callables in module '{}' without explicit async/sync configuration in config.toml:\n",
            unconfigured_callables.len(),
            module_name
        );

        for (spec, info) in &unconfigured_callables {
            message.push_str(&format!("  - {}: {}\n", spec, info));
        }

        message.push_str(
            "\nPlease add these callables to the `toolkit/components/uniffi-bindgen-gecko-js/config.toml` file with explicit configuration:\n",
        );
        message.push_str(&format!("[{}.async_wrappers]\n", crate_name));

        for (spec, _) in &unconfigured_callables {
            message.push_str(&format!("\"{}\" = \"AsyncWrapped\"  # or \"Sync\"\n", spec));
        }

        // Fail the build with a helpful error message
        return Err(anyhow!(message));
    }

    Ok(())
}
