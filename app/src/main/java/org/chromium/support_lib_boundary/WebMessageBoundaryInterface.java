package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
