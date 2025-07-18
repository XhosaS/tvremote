package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxc implements vxo {
    public final vxp a;
    final /* synthetic */ vxe b;
    private final Uri c;
    private final String[] d;

    public vxc(vxe vxeVar, Uri uri, String[] strArr) {
        this.b = vxeVar;
        this.c = uri;
        this.d = strArr;
        this.a = new vxd(vxeVar, uri).b;
    }

    @Override // defpackage.vxo
    public final zwc a() {
        Uri uri = this.c;
        uri.getClass();
        vxe vxeVar = this.b;
        vxa vxaVar = new vxa(vxeVar, uri, this.d);
        int i = upy.a;
        upw upwVar = new upw(vxaVar);
        upwVar.e(vxeVar.d);
        zwk zwkVar = zwk.a;
        return zwc.b(upwVar, zwkVar).d(wyo.e(new zvy() { // from class: vxb
            @Override // defpackage.zvy
            public final Object a(zvz zvzVar, Object obj) {
                return vxn.a((Cursor) obj, Instant.now());
            }
        }), zwkVar);
    }

    @Override // defpackage.vxo
    public final zyd b() {
        return zxy.a;
    }

    @Override // defpackage.vxo
    public final /* synthetic */ Object c() {
        return this.a;
    }
}
