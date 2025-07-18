package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htk extends htb implements hns {
    public htk(hti htiVar) {
        super(htiVar);
    }

    @Override // defpackage.hnv
    public final int a() {
        htn htnVar = ((hti) this.a).a.a;
        hku hkuVar = (hku) htnVar.a;
        return hkuVar.a.limit() + hkuVar.c.length + (hkuVar.d.length * 4) + htnVar.j;
    }

    @Override // defpackage.hnv
    public final Class b() {
        return hti.class;
    }

    @Override // defpackage.htb, defpackage.hns
    public final void d() {
        ((hti) this.a).a().prepareToDraw();
    }

    @Override // defpackage.hnv
    public final void e() {
        hti htiVar = (hti) this.a;
        htiVar.stop();
        htiVar.b = true;
        htn htnVar = htiVar.a.a;
        htnVar.b.clear();
        htnVar.d();
        htnVar.f();
        htm htmVar = htnVar.e;
        if (htmVar != null) {
            htnVar.c.j(htmVar);
            htnVar.e = null;
        }
        htm htmVar2 = htnVar.g;
        if (htmVar2 != null) {
            htnVar.c.j(htmVar2);
            htnVar.g = null;
        }
        htm htmVar3 = htnVar.i;
        if (htmVar3 != null) {
            htnVar.c.j(htmVar3);
            htnVar.i = null;
        }
        hku hkuVar = (hku) htnVar.a;
        hkuVar.f = null;
        byte[] bArr = hkuVar.c;
        if (bArr != null) {
            hkuVar.j.C(bArr);
        }
        int[] iArr = hkuVar.d;
        if (iArr != null) {
            ((hok) hkuVar.j.a).c(iArr);
        }
        Bitmap bitmap = hkuVar.g;
        if (bitmap != null) {
            hkuVar.j.B(bitmap);
        }
        hkuVar.g = null;
        hkuVar.a = null;
        hkuVar.h = null;
        byte[] bArr2 = hkuVar.b;
        if (bArr2 != null) {
            hkuVar.j.C(bArr2);
        }
        htnVar.f = true;
    }
}
