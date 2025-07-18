package com.youtube.android.libraries.elements.templates;

import defpackage.aeef;
import defpackage.mhw;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EkoProcessor {
    static {
        mhw.a();
    }

    public static aeef a(byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = {null, null};
        Status statusNativeProcess = nativeProcess(bArr, bArr2, bArr3);
        return statusNativeProcess.e() ? new aeef(statusNativeProcess, bArr3[0]) : new aeef(statusNativeProcess, null);
    }

    private static native Status nativeProcess(byte[] bArr, byte[] bArr2, byte[][] bArr3);
}
