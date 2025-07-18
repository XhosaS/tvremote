package defpackage;

import android.net.http.HttpException;
import android.net.http.NetworkException;
import android.net.http.QuicException;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class afw$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof NetworkException;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof HttpException;
    }

    public static /* bridge */ /* synthetic */ NetworkException m(Object obj) {
        return (NetworkException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ QuicException m4m(Object obj) {
        return (QuicException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m16m(Object obj) {
        return obj instanceof QuicException;
    }
}
