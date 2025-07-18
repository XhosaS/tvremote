package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafa {
    public static final aabp a;
    public static final aabn b;
    public static final aaav c;
    public static final aaas d;
    private static final aage e;

    static {
        aage aageVarA = aacj.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        e = aageVarA;
        a = new aabo(aaeb.class, aabz.class);
        b = new aabm(aageVarA, aabz.class);
        c = new aaat(aadt.class, aaby.class, new aaau() { // from class: aaey
            @Override // defpackage.aaau
            public final aacc a(zzn zznVar) throws GeneralSecurityException {
                int i;
                int iA;
                aadt aadtVar = (aadt) zznVar;
                aabp aabpVar = aafa.a;
                aacp aacpVar = aacp.a;
                aaco aacoVar = new aaco();
                byte[] bArrB = aadtVar.b.a.b();
                abvo abvoVarU = abvo.u(bArrB, 0, bArrB.length);
                if ((aacoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacoVar.y();
                }
                ((aacp) aacoVar.b).f = abvoVarU;
                aaeb aaebVar = aadtVar.a;
                aacr aacrVar = aacr.a;
                aacq aacqVar = new aacq();
                int iIntValue = aaebVar.d.intValue();
                if ((aacqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacqVar.y();
                }
                ((aacr) aacqVar.b).b = iIntValue;
                int iIntValue2 = aaebVar.b.intValue();
                if ((aacqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacqVar.y();
                }
                ((aacr) aacqVar.b).c = iIntValue2;
                aaea aaeaVar = aaebVar.c;
                if (aaea.a.equals(aaeaVar)) {
                    i = 3;
                } else if (aaea.b.equals(aaeaVar)) {
                    i = 5;
                } else {
                    if (!aaea.c.equals(aaeaVar)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(aaeaVar.d));
                    }
                    i = 6;
                }
                if ((aacqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacqVar.y();
                }
                ((aacr) aacqVar.b).d = aacu.a(i);
                aacr aacrVar2 = (aacr) aacqVar.v();
                if ((aacoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aacoVar.y();
                }
                aacp aacpVar2 = (aacp) aacoVar.b;
                aacrVar2.getClass();
                aacpVar2.e = aacrVar2;
                aacpVar2.c |= 1;
                aacp aacpVar3 = (aacp) aacoVar.v();
                try {
                    int i2 = aacpVar3.memoizedSerializedSize;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(aacpVar3.getClass()).a(aacpVar3);
                        if (iA < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                        }
                    } else {
                        iA = i2 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(aacpVar3.getClass()).a(aacpVar3);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                            aacpVar3.memoizedSerializedSize = (aacpVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(aacpVar3.getClass()).m(aacpVar3, abwa.a(abvwVar));
                    return aaby.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", abvk.a(abvwVar, bArr), aacy.SYMMETRIC, aadj.RAW, null);
                } catch (IOException e2) {
                    throw new RuntimeException("Serializing " + aacpVar3.getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
                }
            }
        });
        d = new aaaq(aageVarA, aaby.class, new aaar() { // from class: aaez
            @Override // defpackage.aaar
            public final zzn a(aacc aaccVar) throws abxv, GeneralSecurityException {
                aaea aaeaVar;
                String str = ((aaby) aaccVar).a;
                aabp aabpVar = aafa.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                }
                try {
                    abvo abvoVar = ((aaby) aaccVar).c;
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    abza abzaVar = abza.a;
                    ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                    aacp aacpVar = aacp.a;
                    abvt abvtVarK = abvoVar.k();
                    aacp aacpVar2 = new aacp();
                    try {
                        try {
                            try {
                                abzj abzjVarA = abza.a.a(aacpVar2.getClass());
                                abzjVarA.i(aacpVar2, abvu.p(abvtVarK), extensionRegistryLite2);
                                abzjVarA.g(aacpVar2);
                                try {
                                    abvtVarK.z(0);
                                    Byte b2 = (byte) 1;
                                    b2.getClass();
                                    if (aacpVar2.d != 0) {
                                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                                    }
                                    aacr aacrVar = aacpVar2.e;
                                    if (aacrVar == null) {
                                        aacrVar = aacr.a;
                                    }
                                    Integer numValueOf = Integer.valueOf(aacpVar2.f.d());
                                    Integer numValueOf2 = Integer.valueOf(aacrVar.c);
                                    Integer numValueOf3 = Integer.valueOf(aacrVar.b);
                                    int iB = aacu.b(aacrVar.d);
                                    if (iB == 0) {
                                        iB = 1;
                                    }
                                    int i = iB - 2;
                                    if (i == 1) {
                                        aaeaVar = aaea.a;
                                    } else if (i == 3) {
                                        aaeaVar = aaea.b;
                                    } else {
                                        if (i != 4) {
                                            throw new GeneralSecurityException("Unable to parse HashType: " + aacu.a(iB));
                                        }
                                        aaeaVar = aaea.c;
                                    }
                                    return aadt.a(aadz.a(numValueOf, numValueOf2, aaeaVar, numValueOf3), aagf.b(aacpVar2.f.B()));
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
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                }
            }
        });
    }
}
