package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafk extends aafm {
    private final aafo a;
    private final aafo b;
    private final String[] c;

    public aafk(aafo aafoVar, aafo aafoVar2) {
        this.a = aafoVar;
        this.b = aafoVar2;
        HashSet hashSet = new HashSet();
        for (String str : aafoVar.a()) {
            String[] strArrA = this.b.a();
            for (int i = 0; i <= 0; i++) {
                hashSet.add(String.valueOf(str).concat(String.valueOf(strArrA[i])));
            }
        }
        this.c = (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @Override // defpackage.aafo
    public final String[] a() {
        return (String[]) this.c.clone();
    }
}
