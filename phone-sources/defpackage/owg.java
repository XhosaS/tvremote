package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owg implements nfc {
    private final String a;
    private final List b;
    private final boolean c;

    public owg(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.nfc
    public final String a() {
        String str = this.a;
        return str == null ? "no_id" : str;
    }

    @Override // defpackage.nfc
    public final String b(dze dzeVar) {
        if (!eae.l(dzeVar.Y)) {
            return osk.D(dzeVar);
        }
        String strD = osk.D(dzeVar);
        vtw vtwVarM = wgc.a.m();
        vtwVarM.getClass();
        String str = dzeVar.N;
        if (str != null) {
            vtw vtwVarM2 = wgb.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            wgb wgbVar = (wgb) vucVar;
            wgbVar.b |= 1;
            wgbVar.c = "lang";
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            wgb wgbVar2 = (wgb) vtwVarM2.b;
            wgbVar2.b |= 2;
            wgbVar2.d = str;
            vuc vucVarR = vtwVarM2.r();
            vucVarR.getClass();
            vtwVarM.aC((wgb) vucVarR);
        }
        int i = dzeVar.P;
        String str2 = ((i & 512) == 0 && (i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) ? (i & 8) != 0 ? "3" : (i & 16) != 0 ? "1" : "0" : "2";
        vtw vtwVarM3 = wgb.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar2 = vtwVarM3.b;
        wgb wgbVar3 = (wgb) vucVar2;
        wgbVar3.b |= 1;
        wgbVar3.c = "acont";
        if (!vucVar2.A()) {
            vtwVarM3.u();
        }
        wgb wgbVar4 = (wgb) vtwVarM3.b;
        wgbVar4.b |= 2;
        wgbVar4.d = str2;
        vuc vucVarR2 = vtwVarM3.r();
        vucVarR2.getClass();
        vtwVarM.aC((wgb) vucVarR2);
        String strEncodeToString = Base64.encodeToString(((wgc) vtwVarM.r()).h(), 11);
        strEncodeToString.getClass();
        return a.cq(strEncodeToString, strD, ";");
    }

    @Override // defpackage.nfc
    public final String c() {
        return "gp";
    }

    @Override // defpackage.nfc
    public final List d() {
        return this.b;
    }

    @Override // defpackage.nfc
    public final boolean e() {
        return this.c;
    }

    public owg() {
        this(null, yhb.a, false);
    }
}
