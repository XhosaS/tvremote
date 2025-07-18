package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzu implements aaaw {
    public final aade a;
    public final List b;

    public zzu(aade aadeVar, List list) throws GeneralSecurityException {
        this.a = aadeVar;
        this.b = list;
        if (aaad.a.a.get()) {
            HashSet hashSet = new HashSet();
            for (aadd aaddVar : aadeVar.c) {
                if (hashSet.contains(Integer.valueOf(aaddVar.e))) {
                    throw new GeneralSecurityException("KeyID " + aaddVar.e + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(aaddVar.e));
            }
            if (!hashSet.contains(Integer.valueOf(aadeVar.b))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public static final zzu b(aade aadeVar) throws GeneralSecurityException {
        d(aadeVar);
        List listE = e(aadeVar);
        aabb aabbVar = aabb.a;
        return new zzu(aadeVar, listE);
    }

    public static void d(aade aadeVar) throws GeneralSecurityException {
        if (aadeVar == null || aadeVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static List e(aade aadeVar) throws GeneralSecurityException {
        zzo zzoVar;
        ArrayList arrayList = new ArrayList(aadeVar.c.size());
        for (aadd aaddVar : aadeVar.c) {
            int i = aaddVar.e;
            try {
                aadj aadjVarB = aadj.b(aaddVar.f);
                if (aadjVarB == null) {
                    aadjVarB = aadj.UNRECOGNIZED;
                }
                Integer numValueOf = aadjVarB == aadj.RAW ? null : Integer.valueOf(i);
                aacz aaczVar = aaddVar.c;
                if (aaczVar == null) {
                    aaczVar = aacz.a;
                }
                String str = aaczVar.b;
                aacz aaczVar2 = aaddVar.c;
                abvo abvoVar = (aaczVar2 == null ? aacz.a : aaczVar2).c;
                if (aaczVar2 == null) {
                    aaczVar2 = aacz.a;
                }
                aacy aacyVarB = aacy.b(aaczVar2.d);
                if (aacyVarB == null) {
                    aacyVarB = aacy.UNRECOGNIZED;
                }
                aadj aadjVarB2 = aadj.b(aaddVar.f);
                if (aadjVarB2 == null) {
                    aadjVarB2 = aadj.UNRECOGNIZED;
                }
                aaby aabyVarA = aaby.a(str, abvoVar, aacyVarB, aadjVarB2, numValueOf);
                aabk aabkVar = aabk.a;
                zzn aaazVar = !((aacg) aabkVar.b.get()).b.containsKey(new aace(aabyVarA.getClass(), aabyVarA.b)) ? new aaaz(aabyVarA) : aabkVar.a(aabyVarA, zzx.a);
                int iB = aada.b(aaddVar.d);
                boolean z = true;
                if (iB == 0) {
                    iB = 1;
                }
                int i2 = iB - 2;
                if (i2 == 1) {
                    zzoVar = zzo.a;
                } else if (i2 == 2) {
                    zzoVar = zzo.b;
                } else {
                    if (i2 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzoVar = zzo.c;
                }
                if (i != aadeVar.b) {
                    z = false;
                }
                arrayList.add(new zzt(aaazVar, zzoVar, z));
            } catch (GeneralSecurityException e) {
                if (aaad.a.a.get()) {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.aaaw
    public final int a() {
        return this.b.size();
    }

    public final Object c(zzm zzmVar, Class cls) throws GeneralSecurityException {
        if (!(zzmVar instanceof aaao)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        aade aadeVar = this.a;
        int i = zzz.a;
        int i2 = aadeVar.b;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (aadd aaddVar : aadeVar.c) {
            int i4 = aaddVar.d;
            int iB = aada.b(i4);
            if (iB != 0 && iB == 3) {
                if ((aaddVar.b & 1) == 0) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(aaddVar.e)));
                }
                aadj aadjVarB = aadj.b(aaddVar.f);
                if (aadjVarB == null) {
                    aadjVarB = aadj.UNRECOGNIZED;
                }
                if (aadjVarB == aadj.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(aaddVar.e)));
                }
                int iB2 = aada.b(i4);
                if (iB2 != 0 && iB2 == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(aaddVar.e)));
                }
                if (aaddVar.e == i2) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                aacz aaczVar = aaddVar.c;
                if (aaczVar == null) {
                    aaczVar = aacz.a;
                }
                aacy aacyVarB = aacy.b(aaczVar.d);
                if (aacyVarB == null) {
                    aacyVarB = aacy.UNRECOGNIZED;
                }
                z2 &= aacyVarB == aacy.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i5 = 0; i5 < a(); i5++) {
            if (this.b.get(i5) == null) {
                aacz aaczVar2 = ((aadd) aadeVar.c.get(i5)).c;
                if (aaczVar2 == null) {
                    aaczVar2 = aacz.a;
                }
                throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + aaczVar2.b + " failed, unable to get primitive");
            }
        }
        aabw aabwVar = ((aaan) zzmVar).a;
        Map map = aabwVar.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        aabx aabxVar = (aabx) map.get(cls);
        return aabxVar.b(this, new aabt(aabwVar, aabxVar));
    }

    public final String toString() {
        return zzz.a(this.a).toString();
    }
}
