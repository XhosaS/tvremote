package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaeu implements aabx {
    public static final aaeu a = new aaeu();
    public static final aabs b = new aabq(aaaz.class, zzy.class, new aabr() { // from class: aaet
        @Override // defpackage.aabr
        public final Object a(zzn zznVar) throws GeneralSecurityException {
            aaby aabyVar = ((aaaz) zznVar).a;
            aaaz.a(aabyVar);
            aaax aaaxVarA = aaap.a.a(aabyVar.a);
            if (aaaxVarA.a().equals(zzy.class)) {
                return aaaxVarA.b(aabyVar.c);
            }
            throw new GeneralSecurityException("Primitive type " + zzy.class.getName() + " not supported by key manager of type " + String.valueOf(aaaxVarA.getClass()) + ", which only supports: " + aaaxVarA.a().toString());
        }
    });

    @Override // defpackage.aabx
    public final Class a() {
        return zzy.class;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, zzy] */
    @Override // defpackage.aabx
    public final /* bridge */ /* synthetic */ Object b(aaaw aaawVar, aabt aabtVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aaawVar.a(); i++) {
            zzu zzuVar = (zzu) aaawVar;
            if (i >= zzuVar.a()) {
                throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + zzuVar.a());
            }
            List list = zzuVar.b;
            if (list.get(i) == null) {
                throw new IllegalStateException(a.a(i, "Keyset-Entry at position ", " has wrong status or key parsing failed"));
            }
            zzt zztVar = (zzt) list.get(i);
            if (zztVar.b.equals(zzo.a)) {
                arrayList.add(aabtVar.a(zztVar));
            }
        }
        for (zzt zztVar2 : ((zzu) aaawVar).b) {
            if (zztVar2 != null && zztVar2.c) {
                if (zztVar2.b == zzo.a) {
                    return new aaeq(arrayList, aabtVar.a(zztVar2));
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }
}
