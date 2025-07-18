package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnh implements nfc {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ lnk d;

    public lnh(lnk lnkVar, String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = lnkVar;
    }

    @Override // defpackage.nfc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.nfc
    public final String b(dze dzeVar) {
        if (this.b != -1) {
            return null;
        }
        String str = dzeVar.K;
        int iIndexOf = str.indexOf(":") + 1;
        String str2 = dzeVar.Y;
        String strSubstring = str.substring(iIndexOf);
        if (!eae.l(str2)) {
            return strSubstring;
        }
        vtw vtwVarM = wgc.a.m();
        String str3 = dzeVar.N;
        if (!TextUtils.isEmpty(str3)) {
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
            str3.getClass();
            wgbVar2.b |= 2;
            wgbVar2.d = str3;
            vtwVarM.aC((wgb) vtwVarM2.r());
        }
        vtw vtwVarM3 = wgb.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar2 = vtwVarM3.b;
        wgb wgbVar3 = (wgb) vucVar2;
        wgbVar3.b |= 1;
        wgbVar3.c = "acont";
        int i = dzeVar.P;
        String str4 = ((i & 512) == 0 && (i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) ? (i & 8) != 0 ? "3" : (i & 16) != 0 ? "1" : "0" : "2";
        if (!vucVar2.A()) {
            vtwVarM3.u();
        }
        wgb wgbVar4 = (wgb) vtwVarM3.b;
        wgbVar4.b |= 2;
        wgbVar4.d = str4;
        vtwVarM.aC((wgb) vtwVarM3.r());
        return a.cq(Base64.encodeToString(((wgc) vtwVarM.r()).h(), 11), strSubstring, ";");
    }

    @Override // defpackage.nfc
    public final String c() {
        return "gp";
    }

    @Override // defpackage.nfc
    public final List d() {
        long j = this.d.e;
        return j == -1 ? ImmutableList.of() : ImmutableList.of(Long.valueOf(j));
    }

    @Override // defpackage.nfc
    public final boolean e() {
        return this.c;
    }
}
