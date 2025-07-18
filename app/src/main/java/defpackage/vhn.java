package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhn {
    public static final zdy a = zdy.h("com/google/apps/tiktok/account/data/AccountInvalidator");
    public final vib b;

    public vhn(vib vibVar) {
        this.b = vibVar;
    }

    public final zyd a() {
        vib vibVar = this.b;
        zyd zydVarH = zud.h(vibVar.a(), Throwable.class, wyo.c(new zvi() { // from class: vhm
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                ((zdv) ((zdv) ((zdv) vhn.a.c()).p((Throwable) obj)).q("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).u("Account sync failed");
                return this.a.b.c.a(new yqi() { // from class: vhx
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        vih vihVar = new vih();
                        vihVar.B((vii) obj2);
                        abxd abxdVar = vihVar.a;
                        if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                            throw new IllegalArgumentException("Default instance must be immutable.");
                        }
                        vihVar.b = (abxd) abxdVar.cM(4, null);
                        long epochMilli = Instant.now().toEpochMilli();
                        if ((vihVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vihVar.y();
                        }
                        vii viiVar = (vii) vihVar.b;
                        vii viiVar2 = vii.a;
                        viiVar.b |= 2;
                        viiVar.d = epochMilli;
                        return (vii) vihVar.v();
                    }
                }, zwk.a);
            }
        }), zwk.a);
        zxn.p(zydVarH, wyo.f(new via(vibVar)), vibVar.f);
        return zydVarH;
    }
}
