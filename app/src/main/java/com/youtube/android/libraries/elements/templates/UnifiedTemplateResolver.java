package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import defpackage.mhw;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UnifiedTemplateResolver {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b;

    static {
        mhw.a();
        b = new AtomicBoolean(false);
    }

    public UnifiedTemplateResolver() {
        this(null, false);
    }

    private native void jni_init(boolean z, boolean z2, DebuggerClient debuggerClient, String str, int i, boolean z3, int i2, WasmTemplateProvider wasmTemplateProvider, PerformanceLogger performanceLogger, boolean z4, CapabilitiesStore capabilitiesStore, ThemeStore themeStore);

    public UnifiedTemplateResolver(String str, boolean z) {
        if (b.compareAndSet(false, true)) {
            jni_init(false, false, null, str == null ? "localhost:5001" : str, 0, z, 0, null, null, false, null, null);
        }
    }
}
