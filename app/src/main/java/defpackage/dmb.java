package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dmb extends dlp implements ddk {
    public dmb(dlz dlzVar) {
        super(dlzVar);
    }

    @Override // defpackage.ddp
    public final int a() {
        dmg dmgVar = ((dlz) this.a).a.a;
        czq czqVar = (czq) dmgVar.a;
        return czqVar.a.limit() + czqVar.c.length + (czqVar.d.length * 4) + dmgVar.j;
    }

    @Override // defpackage.ddp
    public final Class b() {
        return dlz.class;
    }

    @Override // defpackage.dlp, defpackage.ddk
    public final void d() {
        ((dlz) this.a).a().prepareToDraw();
    }

    @Override // defpackage.ddp
    public final void e() {
        dlz dlzVar = (dlz) this.a;
        dlzVar.stop();
        dlzVar.b = true;
        dmg dmgVar = dlzVar.a.a;
        dmgVar.b.clear();
        dmgVar.d();
        dmgVar.d = false;
        dmd dmdVar = dmgVar.e;
        if (dmdVar != null) {
            dmgVar.c.t(dmdVar);
            dmgVar.e = null;
        }
        dmd dmdVar2 = dmgVar.g;
        if (dmdVar2 != null) {
            dmgVar.c.t(dmdVar2);
            dmgVar.g = null;
        }
        dmd dmdVar3 = dmgVar.i;
        if (dmdVar3 != null) {
            dmgVar.c.t(dmdVar3);
            dmgVar.i = null;
        }
        czq czqVar = (czq) dmgVar.a;
        czqVar.f = null;
        byte[] bArr = czqVar.c;
        if (bArr != null) {
            czqVar.j.b(bArr);
        }
        int[] iArr = czqVar.d;
        if (iArr != null) {
            czqVar.j.b.c(iArr);
        }
        Bitmap bitmap = czqVar.g;
        if (bitmap != null) {
            czqVar.j.a(bitmap);
        }
        czqVar.g = null;
        czqVar.a = null;
        czqVar.h = null;
        byte[] bArr2 = czqVar.b;
        if (bArr2 != null) {
            czqVar.j.b(bArr2);
        }
        dmgVar.f = true;
    }
}
