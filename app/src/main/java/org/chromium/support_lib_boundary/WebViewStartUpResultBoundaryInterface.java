package org.chromium.support_lib_boundary;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
