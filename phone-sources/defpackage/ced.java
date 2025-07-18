package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ced implements bav, dvi {
    public final cbc a;
    public final bav b;
    public boolean c;
    public dve d;
    public yjz e = ccn.a;

    public ced(cbc cbcVar, bav bavVar) {
        this.a = cbcVar;
        this.b = bavVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        if (dvcVar == dvc.ON_DESTROY) {
            d();
        } else {
            if (dvcVar != dvc.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }

    public final void b(yjz yjzVar) {
        lz lzVar = new lz(this, yjzVar, 15);
        cbc cbcVar = this.a;
        dhk dhkVarP = cbcVar.P();
        if (dhkVarP != null) {
            lzVar.a(dhkVarP);
        }
        if (cbcVar.isAttachedToWindow()) {
            return;
        }
        cbcVar.E = lzVar;
    }

    @Override // defpackage.bav
    public final void d() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            dve dveVar = this.d;
            if (dveVar != null) {
                dveVar.d(this);
            }
        }
        this.b.d();
    }
}
