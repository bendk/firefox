/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.downloads.listscreen.store

import androidx.test.ext.junit.runners.AndroidJUnit4
import mozilla.components.browser.state.state.BrowserState
import mozilla.components.browser.state.state.content.DownloadState
import mozilla.components.browser.state.store.BrowserStore
import mozilla.components.feature.downloads.DownloadsUseCases
import mozilla.components.feature.downloads.fake.FakeFileSizeFormatter
import mozilla.components.support.test.libstate.ext.waitUntilIdle
import mozilla.components.support.test.rule.MainCoroutineRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotSame
import org.junit.Assert.assertSame
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mozilla.fenix.downloads.fake.FakeDateTimeProvider
import org.mozilla.fenix.downloads.listscreen.middleware.DownloadDeleteMiddleware
import org.mozilla.fenix.downloads.listscreen.middleware.DownloadUIMapperMiddleware
import org.mozilla.fenix.downloads.listscreen.middleware.FakeDelayProvider
import java.time.LocalDate
import java.time.ZoneId
import kotlin.time.Duration.Companion.milliseconds

@RunWith(AndroidJUnit4::class)
class DownloadUIStoreTest {

    @get:Rule
    val coroutineTestRule = MainCoroutineRule()
    private val dispatcher = coroutineTestRule.testDispatcher
    private val scope = coroutineTestRule.scope

    private val fakeFormatter = FakeFileSizeFormatter()
    private val today = LocalDate.of(2025, 5, 31)
    private val older = LocalDate.of(2025, 4, 20)
    private val fakeDateTimeProvider = FakeDateTimeProvider(today)
    private val zoneId = fakeDateTimeProvider.currentZoneId()

    private val fileItem1 = FileItem(
        id = "1",
        url = "https://www.mozilla.com",
        fileName = "1.pdf",
        filePath = "downloads/1.pdf",
        formattedSize = "77",
        contentType = "application/pdf",
        displayedShortUrl = "mozilla.com",
        status = DownloadState.Status.COMPLETED,
        createdTime = CreatedTime.TODAY,
    )
    private val downloadState1 = DownloadState(
        id = "1",
        url = "https://www.mozilla.com",
        createdTime = today.toEpochMilli(zoneId),
        fileName = "1.pdf",
        status = DownloadState.Status.COMPLETED,
        contentLength = 77,
        destinationDirectory = "downloads",
        directoryPath = "downloads",
        contentType = "application/pdf",
    )

    private val fileItem2 = FileItem(
        id = "2",
        url = "url",
        fileName = "title",
        filePath = "downloads/title",
        formattedSize = "77",
        displayedShortUrl = "url",
        contentType = "jpg",
        status = DownloadState.Status.COMPLETED,
        createdTime = CreatedTime.OLDER,
    )

    private val downloadState2 = DownloadState(
        id = "2",
        url = "url",
        createdTime = older.toEpochMilli(zoneId),
        fileName = "title",
        status = DownloadState.Status.COMPLETED,
        contentLength = 77,
        destinationDirectory = "downloads",
        directoryPath = "downloads",
        contentType = "jpg",
    )

    @Test
    fun exitEditMode() {
        val initialState = oneItemEditState()
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.ExitEditMode)
        assertNotSame(initialState, store.state)
        assertEquals(store.state.mode, DownloadUIState.Mode.Normal)
    }

    @Test
    fun itemAddedForRemoval() {
        val initialState = emptyDefaultState()
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.AddItemForRemoval(fileItem2))
        assertNotSame(initialState, store.state)
        assertEquals(
            store.state.mode,
            DownloadUIState.Mode.Editing(setOf(fileItem2)),
        )
    }

    @Test
    fun `WHEN all items are visible and all items selected for removal THEN all items are selected`() {
        val initialState = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
            userSelectedContentTypeFilter = FileItem.ContentTypeFilter.All,
            searchQuery = "",
        )
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.AddAllItemsForRemoval)

        val expected = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Editing(setOf(fileItem1, fileItem2)),
            pendingDeletionIds = emptySet(),
        )

        assertEquals(expected, store.state)
    }

    @Test
    fun `WHEN only filtered items are visible and all items selected for removal THEN only those filtered items are selected`() {
        val image = FileItem(
            id = "1",
            url = "url",
            fileName = "title",
            filePath = "url",
            formattedSize = "77",
            displayedShortUrl = "url",
            contentType = "image/jpeg",
            status = DownloadState.Status.COMPLETED,
            createdTime = CreatedTime.TODAY,
        )

        val document = FileItem(
            id = "2",
            url = "docurl",
            fileName = "doc",
            filePath = "docPath",
            formattedSize = "77",
            displayedShortUrl = "url",
            contentType = "application/pdf",
            status = DownloadState.Status.COMPLETED,
            createdTime = CreatedTime.TODAY,
        )

        val initialState = DownloadUIState(
            items = listOf(image, document),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
            userSelectedContentTypeFilter = FileItem.ContentTypeFilter.All,
            searchQuery = "",
        )
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.ContentTypeSelected(FileItem.ContentTypeFilter.Image))
        store.dispatch(DownloadUIAction.AddAllItemsForRemoval)

        val expected = DownloadUIState(
            items = listOf(image, document),
            mode = DownloadUIState.Mode.Editing(setOf(image)),
            pendingDeletionIds = emptySet(),
            userSelectedContentTypeFilter = FileItem.ContentTypeFilter.Image,
            searchQuery = "",
        )

        assertEquals(expected, store.state)
    }

    @Test
    fun `WHEN items are filtered by content type and search and all items selected for removal THEN only those filtered items are selected`() {
        val image1 = FileItem(
            id = "1",
            url = "url",
            fileName = "title",
            filePath = "filePath",
            formattedSize = "77",
            displayedShortUrl = "url",
            contentType = "image/jpeg",
            status = DownloadState.Status.COMPLETED,
            createdTime = CreatedTime.TODAY,
        )

        val image2 = FileItem(
            id = "2",
            url = "image2",
            fileName = "image2",
            filePath = "filePath2",
            formattedSize = "1234",
            displayedShortUrl = "image2",
            contentType = "image/jpg",
            status = DownloadState.Status.COMPLETED,
            createdTime = CreatedTime.TODAY,
        )

        val document = FileItem(
            id = "3",
            url = "docurl",
            fileName = "doc",
            filePath = "docPath",
            formattedSize = "77",
            displayedShortUrl = "url",
            contentType = "application/pdf",
            status = DownloadState.Status.COMPLETED,
            createdTime = CreatedTime.TODAY,
        )

        val initialState = DownloadUIState(
            items = listOf(image1, image2, document),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
            userSelectedContentTypeFilter = FileItem.ContentTypeFilter.All,
            searchQuery = "",
        )
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.ContentTypeSelected(FileItem.ContentTypeFilter.Image))
        store.dispatch(DownloadUIAction.SearchQueryEntered("url"))
        store.dispatch(DownloadUIAction.AddAllItemsForRemoval)

        val expected = DownloadUIState(
            items = listOf(image1, image2, document),
            mode = DownloadUIState.Mode.Editing(setOf(image1)),
            pendingDeletionIds = emptySet(),
            userSelectedContentTypeFilter = FileItem.ContentTypeFilter.Image,
            searchQuery = "url",
        )

        assertEquals(expected, store.state)
    }

    @Test
    fun removeItemForRemoval() {
        val initialState = twoItemEditState()
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.RemoveItemForRemoval(fileItem2))
        assertNotSame(initialState, store.state)
        assertEquals(store.state.mode, DownloadUIState.Mode.Editing(setOf(fileItem1)))
    }

    @Test
    fun shareUrlClicked() {
        val initialState = oneItemDefaultState()
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.ShareUrlClicked(fileItem1.url))
        assertSame(initialState, store.state)
    }

    @Test
    fun shareFileClicked() {
        val initialState = oneItemDefaultState()
        val store = DownloadUIStore(initialState)

        store.dispatch(DownloadUIAction.ShareFileClicked(fileItem1.filePath, fileItem1.contentType))
        assertSame(initialState, store.state)
    }

    @Test
    fun deleteOneElement() {
        val store = provideDownloadUIStore(BrowserState(downloads = mapOf("1" to downloadState1)))

        val deleteItemSet = setOf(fileItem1.id)
        val expectedUIStateBeforeDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf(),
        )

        val expectedUIStateAfterDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = deleteItemSet,
        )

        assertEquals(expectedUIStateBeforeDeleteAction, store.state)

        store.dispatch(DownloadUIAction.AddPendingDeletionSet(deleteItemSet))
        assertEquals(store.state.pendingDeletionIds, deleteItemSet)
        assertEquals(expectedUIStateAfterDeleteAction, store.state)

        dispatcher.scheduler.advanceTimeBy(UNDO_DELAY_PASSED.milliseconds)
        assertEquals(store.state.pendingDeletionIds, deleteItemSet)
        assertEquals(expectedUIStateAfterDeleteAction, store.state)
    }

    @Test
    fun deleteOneElementAndCancelBeforeDelayExpires() {
        val store = provideDownloadUIStore(
            BrowserState(downloads = mapOf("1" to downloadState1)),
        )

        val deleteItemSet = setOf("1")
        val expectedUIStateBeforeDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
        )

        val expectedUIStateAfterDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf("1"),
        )
        assertEquals(expectedUIStateBeforeDeleteAction, store.state)

        store.dispatch(DownloadUIAction.AddPendingDeletionSet(deleteItemSet))
        assertEquals(expectedUIStateAfterDeleteAction, store.state)

        store.dispatch(DownloadUIAction.UndoPendingDeletion)
        assertEquals(expectedUIStateBeforeDeleteAction, store.state)

        dispatcher.scheduler.advanceTimeBy(UNDO_DELAY_PASSED.milliseconds)
        assertEquals(expectedUIStateBeforeDeleteAction, store.state)
    }

    @Test
    fun deleteOneElementAndCancelAfterDelayExpired() {
        val store = provideDownloadUIStore(
            BrowserState(downloads = mapOf("1" to downloadState1)),
        )

        val expectedUIStateBeforeDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
        )
        val expectedUIStateAfterDeleteAction = DownloadUIState(
            items = listOf(fileItem1),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf("1"),
        )

        assertEquals(expectedUIStateBeforeDeleteAction, store.state)

        store.dispatch(DownloadUIAction.AddPendingDeletionSet(setOf("1")))
        assertEquals(expectedUIStateAfterDeleteAction, store.state)

        dispatcher.scheduler.advanceTimeBy(UNDO_DELAY_PASSED.milliseconds)
        store.dispatch(DownloadUIAction.UndoPendingDeletion)
        dispatcher.scheduler.advanceUntilIdle()

        assertEquals(expectedUIStateAfterDeleteAction, store.state)
    }

    @Test
    fun deleteTwoElementsAndCancelTwice() {
        val store = provideDownloadUIStore(
            BrowserState(downloads = mapOf("1" to downloadState1, "2" to downloadState2)),
        )

        val expectedUIStateBeforeDeleteAction = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = emptySet(),
        )
        val expectedUIStateAfterFirstDeleteAction = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf("2"),
        )
        val expectedUIStateAfterSecondDeleteAction = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf("1", "2"),
        )

        assertEquals(expectedUIStateBeforeDeleteAction, store.state)

        store.dispatch(DownloadUIAction.AddPendingDeletionSet(setOf("2")))
        assertEquals(expectedUIStateAfterFirstDeleteAction, store.state)

        store.dispatch(DownloadUIAction.AddPendingDeletionSet(setOf("1")))
        assertEquals(expectedUIStateAfterSecondDeleteAction, store.state)

        store.dispatch(DownloadUIAction.UndoPendingDeletion)
        assertEquals(expectedUIStateAfterFirstDeleteAction, store.state)

        store.dispatch(DownloadUIAction.UndoPendingDeletion)
        assertEquals(expectedUIStateAfterFirstDeleteAction, store.state)
    }

    private fun provideDownloadUIStore(
        initialState: BrowserState = BrowserState(),
    ): DownloadUIStore {
        val browserStore = BrowserStore(initialState = initialState)

        val deleteMiddleware = DownloadDeleteMiddleware(
            FakeDelayProvider(UNDO_DELAY),
            DownloadsUseCases.RemoveDownloadUseCase(browserStore),
            dispatcher,
        )

        val downloadUIMapperMiddleware = DownloadUIMapperMiddleware(
            browserStore = browserStore,
            fileSizeFormatter = fakeFormatter,
            scope = scope,
            dateTimeProvider = fakeDateTimeProvider,
        )

        return DownloadUIStore(
            initialState = DownloadUIState.INITIAL,
            middleware = listOf(deleteMiddleware, downloadUIMapperMiddleware),
        )
    }

    @Test
    fun `WHEN downloads store is initialised THEN downloads state is updated to be sorted by created time`() {
        val fakeDateTimeProvider = FakeDateTimeProvider(LocalDate.of(2025, 5, 31))
        val zoneId = fakeDateTimeProvider.currentZoneId()

        val downloads = mapOf(
            "1" to DownloadState(
                id = "1",
                url = "https://www.google.com",
                createdTime = LocalDate.of(2025, 3, 1).toEpochMilli(zoneId),
                fileName = "1.pdf",
                status = DownloadState.Status.COMPLETED,
                contentLength = 10000,
                destinationDirectory = "",
                directoryPath = "downloads",
                contentType = "application/pdf",
            ),
            "2" to DownloadState(
                id = "2",
                url = "https://www.google.com",
                createdTime = LocalDate.of(2025, 4, 12).toEpochMilli(zoneId),
                fileName = "2.pdf",
                status = DownloadState.Status.FAILED,
                contentLength = 10000,
                destinationDirectory = "",
                directoryPath = "",
            ),
            "3" to DownloadState(
                id = "3",
                createdTime = LocalDate.of(2025, 5, 31).toEpochMilli(zoneId),
                url = "https://www.google.com",
                fileName = "3.pdf",
                status = DownloadState.Status.COMPLETED,
                contentLength = 10000,
                destinationDirectory = "",
                directoryPath = "downloads",
                contentType = "text/plain",
            ),
        )

        val browserStore = BrowserStore(
            initialState = BrowserState(downloads = downloads),
        )

        val downloadsStore = DownloadUIStore(
            initialState = DownloadUIState.INITIAL,
            middleware = listOf(
                DownloadUIMapperMiddleware(
                    browserStore = browserStore,
                    fileSizeFormatter = fakeFormatter,
                    scope = scope,
                    dateTimeProvider = fakeDateTimeProvider,
                ),
            ),
        )
        downloadsStore.waitUntilIdle()

        val expectedList = DownloadUIState.ItemsState.Items(
            listOf(
                HeaderItem(CreatedTime.TODAY),
                FileItem(
                    id = "3",
                    url = "https://www.google.com",
                    fileName = "3.pdf",
                    filePath = "downloads/3.pdf",
                    formattedSize = "10000",
                    displayedShortUrl = "google.com",
                    contentType = "text/plain",
                    status = DownloadState.Status.COMPLETED,
                    createdTime = CreatedTime.TODAY,
                ),
                HeaderItem(CreatedTime.OLDER),
                FileItem(
                    id = "1",
                    url = "https://www.google.com",
                    fileName = "1.pdf",
                    filePath = "downloads/1.pdf",
                    formattedSize = "10000",
                    displayedShortUrl = "google.com",
                    contentType = "application/pdf",
                    status = DownloadState.Status.COMPLETED,
                    createdTime = CreatedTime.OLDER,
                ),
            ),
        )

        assertEquals(expectedList, downloadsStore.state.itemsState)
    }

    @Test
    fun `WHEN two download states point to the same existing file THEN only one download item is displayed`() {
        val downloads = mapOf(
            "1" to DownloadState(
                id = "1",
                createdTime = 1,
                url = "https://www.google.com",
                fileName = "1.pdf",
                status = DownloadState.Status.COMPLETED,
                contentLength = 10000,
                destinationDirectory = "",
                directoryPath = "downloads",
                contentType = "application/pdf",
            ),
            "2" to DownloadState(
                id = "2",
                createdTime = 2,
                url = "https://www.google.com",
                fileName = "1.pdf",
                status = DownloadState.Status.COMPLETED,
                destinationDirectory = "",
                contentLength = 10000,
                directoryPath = "downloads",
                contentType = "application/pdf",
            ),
        )
        val browserStore = BrowserStore(initialState = BrowserState(downloads = downloads))

        val downloadsStore = DownloadUIStore(
            initialState = DownloadUIState.INITIAL,
            middleware = listOf(
                DownloadUIMapperMiddleware(
                    browserStore = browserStore,
                    fileSizeFormatter = fakeFormatter,
                    scope = scope,
                ),
            ),
        )
        downloadsStore.waitUntilIdle()

        val expectedList = DownloadUIState.ItemsState.Items(
            listOf(
                HeaderItem(CreatedTime.OLDER),
                FileItem(
                    id = "1",
                    url = "https://www.google.com",
                    fileName = "1.pdf",
                    filePath = "downloads/1.pdf",
                    formattedSize = "10000",
                    displayedShortUrl = "google.com",
                    contentType = "application/pdf",
                    status = DownloadState.Status.COMPLETED,
                    createdTime = CreatedTime.OLDER,
                ),
            ),
        )

        assertEquals(expectedList, downloadsStore.state.itemsState)
    }

    @Test
    fun `WHEN UpdateFileItems action is triggered THEN state is updated and keep the items even if they are listed in pendingDeletionIds`() {
        val downloadUIStore = DownloadUIStore(
            initialState = DownloadUIState(
                items = listOf(fileItem1),
                mode = DownloadUIState.Mode.Normal,
                pendingDeletionIds = setOf(fileItem1.id),
            ),
        )

        val expectedState = DownloadUIState(
            items = listOf(fileItem1, fileItem2),
            mode = DownloadUIState.Mode.Normal,
            pendingDeletionIds = setOf(fileItem1.id),
        )

        downloadUIStore.dispatch(DownloadUIAction.UpdateFileItems(listOf(fileItem1, fileItem2)))
        assertEquals(expectedState, downloadUIStore.state)
    }

    private fun LocalDate.toEpochMilli(zoneId: ZoneId): Long {
        return atStartOfDay(zoneId).toInstant().toEpochMilli()
    }

    private fun emptyDefaultState(): DownloadUIState = DownloadUIState(
        items = listOf(),
        mode = DownloadUIState.Mode.Normal,
        pendingDeletionIds = emptySet(),
    )

    private fun oneItemEditState(): DownloadUIState = DownloadUIState(
        items = listOf(),
        mode = DownloadUIState.Mode.Editing(setOf(fileItem1)),
        pendingDeletionIds = emptySet(),
    )

    private fun oneItemDefaultState(): DownloadUIState = DownloadUIState(
        items = listOf(fileItem1),
        mode = DownloadUIState.Mode.Normal,
        pendingDeletionIds = emptySet(),
    )

    private fun twoItemEditState(): DownloadUIState = DownloadUIState(
        items = listOf(),
        mode = DownloadUIState.Mode.Editing(setOf(fileItem1, fileItem2)),
        pendingDeletionIds = emptySet(),
    )

    companion object {
        private const val UNDO_DELAY = 5000L
        private const val UNDO_DELAY_PASSED = 6000L
    }
}
