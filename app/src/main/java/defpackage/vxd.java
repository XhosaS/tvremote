package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxd extends vww implements vyn {
    public final Uri a;
    public final vxp b;
    final /* synthetic */ vxe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxd(vxe vxeVar, Uri uri) {
        super(vxeVar.e, "External ContentObserver notification", vxeVar.f);
        this.c = vxeVar;
        this.b = new vxh(this);
        this.a = uri;
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        if (z) {
            return;
        }
        vxe vxeVar = this.c;
        vxeVar.c.a(zxy.a, this.b);
    }

    @Override // defpackage.vyn
    public final void b() {
        this.c.b.getContentResolver().registerContentObserver(this.a, false, this);
    }

    @Override // defpackage.vyn
    public final void c() {
        this.c.b.getContentResolver().unregisterContentObserver(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vxd) {
            return Objects.equals(this.a, ((vxd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "ResultPropagator for URI: ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
