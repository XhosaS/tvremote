package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxm extends kxv {
    private final Uri a;

    public kxm(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 1 && this.a.equals(kxjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kxj
    public final int i() {
        return 1;
    }

    public final String toString() {
        return "Action{externalDeepLinkAction=" + this.a.toString() + "}";
    }
}
