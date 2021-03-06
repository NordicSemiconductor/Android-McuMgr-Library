/*
 * Copyright (c) 2018, Nordic Semiconductor
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.runtime.mcumgr.sample.observable;

public enum ConnectionState {
    CONNECTING,
    INITIALIZING,
    READY,
    DISCONNECTING,
    DISCONNECTED,
    TIMEOUT,
    NOT_SUPPORTED
}
