package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aady {
    public static final aabs a = new aabq(aadt.class, zzy.class, new aabr() { // from class: aadu
        @Override // defpackage.aabr
        public final Object a(zzn zznVar) {
            return new aafg((aadt) zznVar);
        }
    });
    public static final aabd b;
    public static final aadw c;
    public static final aaax d;

    /* JADX WARN: Type inference failed for: r0v3, types: [aadw] */
    static {
        aacy aacyVar = aacy.SYMMETRIC;
        aacp aacpVar = aacp.a;
        if (aacp.b == null) {
            synchronized (aacp.class) {
                if (aacp.b == null) {
                    aacp.b = new abwx(aacp.a);
                }
            }
        }
        d = new aaax("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", zzy.class, aacyVar);
        b = new aabd() { // from class: aadv
            @Override // defpackage.aabd
            public final zzn a(zzw zzwVar) {
                aaeb aaebVar = (aaeb) zzwVar;
                Integer num = aaebVar.a;
                aabs aabsVar = aady.a;
                return aadt.a(aaebVar, aagf.a(num.intValue()));
            }
        };
        c = new Object() { // from class: aadw
        };
    }
}
