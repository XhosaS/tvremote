package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadp {
    public static final aabs a = new aabq(aadm.class, zzy.class, new aabr() { // from class: aadn
        @Override // defpackage.aabr
        public final Object a(zzn zznVar) {
            return new aafd((aadm) zznVar);
        }
    });
    public static final aabd b = new aabd() { // from class: aado
        @Override // defpackage.aabd
        public final zzn a(zzw zzwVar) {
            aads aadsVar = (aads) zzwVar;
            Integer num = aadsVar.a;
            aabs aabsVar = aadp.a;
            return aadm.a(aadsVar, aagf.a(num.intValue()));
        }
    };
    public static final aaax c;

    static {
        aacy aacyVar = aacy.SYMMETRIC;
        aacl aaclVar = aacl.a;
        if (aacl.b == null) {
            synchronized (aacl.class) {
                if (aacl.b == null) {
                    aacl.b = new abwx(aacl.a);
                }
            }
        }
        c = new aaax("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", zzy.class, aacyVar);
    }
}
