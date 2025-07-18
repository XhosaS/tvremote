package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nun extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? nuo.class : super.loadClass(str, z);
    }
}
