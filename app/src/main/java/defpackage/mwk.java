package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwk implements aggz {
    private final yyr a;

    public mwk(yyr yyrVar) {
        this.a = yyrVar;
    }

    @Override // defpackage.aggz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yyr a(Object[] objArr) {
        yyn yynVar = new yyn(4);
        for (Object obj : objArr) {
            Pair pair = (Pair) obj;
            String str = (String) pair.first;
            yqt yqtVar = (yqt) pair.second;
            byte[] bArr = (byte[]) this.a.get(str);
            bArr.getClass();
            yynVar.c(str, (byte[]) yqtVar.e(bArr));
        }
        return yynVar.a(true);
    }
}
