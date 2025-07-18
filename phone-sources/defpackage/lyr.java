package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lyr implements idw {
    public final /* synthetic */ lys a;
    public final /* synthetic */ ieh b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lyr(lys lysVar, ieh iehVar, boolean z) {
        this.a = lysVar;
        this.b = iehVar;
        this.c = z;
    }

    @Override // defpackage.idw
    public final boolean b(Object obj) {
        kum kumVar = (kum) obj;
        ldy ldyVar = (ldy) this.b;
        lys lysVar = this.a;
        ieg iegVarA = ldyVar.a();
        if (!lysVar.m(iegVarA)) {
            return true;
        }
        lcq lcqVar = ((lcs) lysVar.i.get(((ksn) iegVarA.g()).a)).i;
        if (lcqVar == null) {
            lcqVar = lcq.a;
        }
        boolean z = this.c;
        String str = z ? lcqVar.b : lcqVar.c;
        return TextUtils.isEmpty(str) || lysVar.l.i(((kwf) kumVar).D(), str, z);
    }
}
