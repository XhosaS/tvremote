package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface WebMessageListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2);
}
