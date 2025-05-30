/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at <http://mozilla.org/MPL/2.0/>. */

import { WorkerDispatcher } from "devtools/client/shared/worker-utils";

const WORKER_URL = "resource://devtools/client/debugger/dist/parser-worker.js";

export class ParserDispatcher extends WorkerDispatcher {
  constructor(jestUrl) {
    super(jestUrl || WORKER_URL);
  }

  getScopes = this.task("getScopes");
  async setSource(sourceId, content) {
    const astSource = {
      id: sourceId,
      text: content.type === "wasm" ? "" : content.value,
      contentType: content.contentType || null,
      isWasm: content.type === "wasm",
    };

    return this.invoke("setSource", astSource);
  }

  mapExpression = this.task("mapExpression");
  clearSources = this.task("clearSources");
}
