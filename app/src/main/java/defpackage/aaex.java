package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaex {
    public static final aabp a;
    public static final aabn b;
    public static final aaav c;
    public static final aaas d;
    private static final aage e;

    static {
        aage aageVarA = aacj.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        e = aageVarA;
        a = new aabo(aads.class, aabz.class);
        b = new aabm(aageVarA, aabz.class);
        c = new aaat(aadm.class, aaby.class, new aaau() { // from class: aaev
            @Override // defpackage.aaau
            public final aacc a(zzn zznVar) throws GeneralSecurityException {
                int iA;
                aadm aadmVar = (aadm) zznVar;
                aabp aabpVar = aaex.a;
                aacl aaclVar = aacl.a;
                aack aackVar = new aack();
                byte[] bArrB = aadmVar.b.a.b();
                abvo abvoVarU = abvo.u(bArrB, 0, bArrB.length);
                if ((aackVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aackVar.y();
                }
                ((aacl) aackVar.b).f = abvoVarU;
                aads aadsVar = aadmVar.a;
                aacn aacnVar = aacn.a;
                aacm aacmVar = new aacm();
                int iIntValue = aadsVar.f.intValue();
                if ((aacmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacmVar.y();
                }
                ((aacn) aacmVar.b).c = iIntValue;
                int iIntValue2 = aadsVar.b.intValue();
                if ((aacmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacmVar.y();
                }
                ((aacn) aacmVar.b).d = iIntValue2;
                int iA2 = aaex.a(aadsVar.c);
                if ((aacmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacmVar.y();
                }
                ((aacn) aacmVar.b).e = aacu.a(iA2);
                aacw aacwVar = aacw.a;
                aacv aacvVar = new aacv();
                int iA3 = aaex.a(aadsVar.d);
                if ((aacvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacvVar.y();
                }
                ((aacw) aacvVar.b).b = aacu.a(iA3);
                int iIntValue3 = aadsVar.e.intValue();
                if ((aacvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacvVar.y();
                }
                ((aacw) aacvVar.b).c = iIntValue3;
                if ((aacmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacmVar.y();
                }
                aacn aacnVar2 = (aacn) aacmVar.b;
                aacw aacwVar2 = (aacw) aacvVar.v();
                aacwVar2.getClass();
                aacnVar2.f = aacwVar2;
                aacnVar2.b |= 1;
                aacn aacnVar3 = (aacn) aacmVar.v();
                if ((aackVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aackVar.y();
                }
                aacl aaclVar2 = (aacl) aackVar.b;
                aacnVar3.getClass();
                aaclVar2.e = aacnVar3;
                aaclVar2.c |= 1;
                aacl aaclVar3 = (aacl) aackVar.v();
                try {
                    int i = aaclVar3.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(aaclVar3.getClass()).a(aaclVar3);
                        if (iA < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(aaclVar3.getClass()).a(aaclVar3);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                            aaclVar3.memoizedSerializedSize = (aaclVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(aaclVar3.getClass()).m(aaclVar3, abwa.a(abvwVar));
                    return aaby.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", abvk.a(abvwVar, bArr), aacy.SYMMETRIC, aadj.RAW, null);
                } catch (IOException e2) {
                    throw new RuntimeException("Serializing " + aaclVar3.getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
                }
            }
        });
        d = new aaaq(aageVarA, aaby.class, new aaar() { // from class: aaew
            @Override // defpackage.aaar
            public final zzn a(aacc aaccVar) throws abxv, GeneralSecurityException {
                String str = ((aaby) aaccVar).a;
                aabp aabpVar = aaex.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                try {
                    abvo abvoVar = ((aaby) aaccVar).c;
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    abza abzaVar = abza.a;
                    ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                    aacl aaclVar = aacl.a;
                    abvt abvtVarK = abvoVar.k();
                    aacl aaclVar2 = new aacl();
                    try {
                        try {
                            try {
                                abzj abzjVarA = abza.a.a(aaclVar2.getClass());
                                abzjVarA.i(aaclVar2, abvu.p(abvtVarK), extensionRegistryLite2);
                                abzjVarA.g(aaclVar2);
                                try {
                                    abvtVarK.z(0);
                                    int i = 1;
                                    Byte b2 = (byte) 1;
                                    b2.getClass();
                                    if (aaclVar2.d != 0) {
                                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                                    }
                                    aacn aacnVar = aaclVar2.e;
                                    if (aacnVar == null) {
                                        aacnVar = aacn.a;
                                    }
                                    Integer numValueOf = Integer.valueOf(aaclVar2.f.d());
                                    Integer numValueOf2 = Integer.valueOf(aacnVar.d);
                                    Integer numValueOf3 = Integer.valueOf(aacnVar.c);
                                    int iB = aacu.b(aacnVar.e);
                                    if (iB == 0) {
                                        iB = 1;
                                    }
                                    aadr aadrVarB = aaex.b(iB);
                                    aacw aacwVar = aacnVar.f;
                                    if (aacwVar == null) {
                                        aacwVar = aacw.a;
                                    }
                                    int iB2 = aacu.b(aacwVar.b);
                                    if (iB2 != 0) {
                                        i = iB2;
                                    }
                                    aadr aadrVarB2 = aaex.b(i);
                                    aacw aacwVar2 = aacnVar.f;
                                    if (aacwVar2 == null) {
                                        aacwVar2 = aacw.a;
                                    }
                                    return aadm.a(aadq.a(numValueOf, numValueOf2, aadrVarB, aadrVarB2, Integer.valueOf(aacwVar2.c), numValueOf3), aagf.b(aaclVar2.f.B()));
                                } catch (abxv e2) {
                                    throw e2;
                                }
                            } catch (abxv e3) {
                                if (e3.a) {
                                    throw new abxv(e3);
                                }
                                throw e3;
                            } catch (IOException e4) {
                                if (e4.getCause() instanceof abxv) {
                                    throw ((abxv) e4.getCause());
                                }
                                throw new abxv(e4);
                            }
                        } catch (abzz e5) {
                            throw e5.a();
                        }
                    } catch (RuntimeException e6) {
                        if (e6.getCause() instanceof abxv) {
                            throw ((abxv) e6.getCause());
                        }
                        throw e6;
                    }
                } catch (abxv unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                }
            }
        });
    }

    public static int a(aadr aadrVar) throws GeneralSecurityException {
        if (aadr.a.equals(aadrVar)) {
            return 3;
        }
        if (aadr.b.equals(aadrVar)) {
            return 5;
        }
        if (aadr.c.equals(aadrVar)) {
            return 6;
        }
        throw new GeneralSecurityException("Unable to serialize HashType ".concat(aadrVar.d));
    }

    public static aadr b(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return aadr.a;
        }
        if (i2 == 3) {
            return aadr.b;
        }
        if (i2 == 4) {
            return aadr.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + aacu.a(i));
    }
}
