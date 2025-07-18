package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjk {
    private static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/elements/DataStoreBatchUpdateProcessor");
    private final oat b;
    private final tkv c;
    private final tmm d;
    private final tmi e;

    public tjk(oat oatVar, tkv tkvVar, tmm tmmVar, tmi tmiVar) {
        this.b = oatVar;
        this.c = tkvVar;
        this.d = tmmVar;
        this.e = tmiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(adct adctVar) {
        int iA;
        for (adcv adcvVar : adctVar.b) {
            adcv adcvVar2 = adcv.a;
            if (adcvVar2 != adcvVar && (adcvVar == null || adcvVar2.getClass() != adcvVar.getClass() || !abza.a.a(adcvVar2.getClass()).k(adcvVar2, adcvVar))) {
                String str = adcvVar.b;
                int iA2 = adcz.a(adcvVar.c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                adcx adcxVar = adcvVar.d;
                if (adcxVar == null) {
                    adcxVar = adcx.a;
                }
                int i = iA2 - 1;
                if (i == 1) {
                    abxc abxcVar = adfr.b;
                    MessageLite messageLite = abxcVar.a;
                    adcx adcxVar2 = adcx.a;
                    if (messageLite != adcxVar2) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    abwr abwrVar = adcxVar.n;
                    abxb abxbVar = abxcVar.d;
                    if (abwrVar.n(abxbVar)) {
                        tkv tkvVar = this.c;
                        if (messageLite != adcxVar2) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        Object objK = adcxVar.n.k(abxbVar);
                        tok tokVar = (tok) tkvVar;
                        adfp adfpVar = (adfp) (objK == null ? abxcVar.b : abxcVar.b(objK));
                        if ((tokVar.a.getResources().getConfiguration().uiMode & 48) == 32 && DesugarCollections.unmodifiableMap(adfpVar.b).containsKey(2)) {
                            oat oatVar = tokVar.b;
                            abyl abylVar = adfpVar.b;
                            if (!abylVar.containsKey(2)) {
                                throw new IllegalArgumentException();
                            }
                            oatVar.b(str, ((abuy) abylVar.get(2)).c.B());
                        } else {
                            oat oatVar2 = tokVar.b;
                            abyl abylVar2 = adfpVar.b;
                            if (!abylVar2.containsKey(1)) {
                                throw new IllegalArgumentException();
                            }
                            oatVar2.b(str, ((abuy) abylVar2.get(1)).c.B());
                        }
                    } else {
                        abxc abxcVar2 = aded.b;
                        MessageLite messageLite2 = abxcVar2.a;
                        if (messageLite2 != adcxVar2) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        abwr abwrVar2 = adcxVar.n;
                        abxb abxbVar2 = abxcVar2.d;
                        if (abwrVar2.n(abxbVar2)) {
                            adei adeiVar = adei.a;
                            adeh adehVar = new adeh();
                            if (messageLite2 != adcxVar2) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK2 = adcxVar.n.k(abxbVar2);
                            Iterator it = ((aded) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2))).c.iterator();
                            while (true) {
                                boolean z = false;
                                if (!it.hasNext()) {
                                    break;
                                }
                                adeb adebVar = (adeb) it.next();
                                int i2 = adebVar.b;
                                if ((i2 & 2) != 0 && (i2 & 1) != 0) {
                                    z = true;
                                }
                                yqw.B(z, "RequiredResources must have both the name and resource fields filled in.");
                                if (adebVar.d == null) {
                                    adef adefVar = adef.a;
                                }
                                String str2 = adebVar.c;
                                str2.getClass();
                                yqw.B(!DesugarCollections.unmodifiableMap(((adei) adehVar.b).b).containsKey(str2), "You can not have two RequiredResources with the same name");
                                this.e.g("PreregisteredResources.AvailabilityCheck.Outcome", 1);
                                ((zdv) ((zdv) ((zdv) a.c()).o(tmm.a, this.d.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/DataStoreBatchUpdateProcessor", "processRequiredResources", 134, "DataStoreBatchUpdateProcessor.java")).u("A Required Resource was requested but an xUiKitResourceCache has not been provided in this client.");
                                addz addzVar = addz.a;
                                addx addxVar = new addx();
                                if ((addxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    addxVar.y();
                                }
                                addz addzVar2 = (addz) addxVar.b;
                                addzVar2.c = 1;
                                addzVar2.b |= 1;
                                addz addzVar3 = (addz) addxVar.v();
                                str2.getClass();
                                addzVar3.getClass();
                                if ((Integer.MIN_VALUE & adehVar.b.memoizedSerializedSize) == 0) {
                                    adehVar.y();
                                }
                                adei adeiVar2 = (adei) adehVar.b;
                                abyl abylVar3 = adeiVar2.b;
                                if (!abylVar3.b) {
                                    adeiVar2.b = abylVar3.a();
                                }
                                adeiVar2.b.put(str2, addzVar3);
                            }
                            oat oatVar3 = this.b;
                            adei adeiVar3 = (adei) adehVar.v();
                            try {
                                int i3 = adeiVar3.memoizedSerializedSize;
                                if ((i3 & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(adeiVar3.getClass()).a(adeiVar3);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i3 & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(adeiVar3.getClass()).a(adeiVar3);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        adeiVar3.memoizedSerializedSize = (adeiVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                    }
                                }
                                byte[] bArr = new byte[iA];
                                boolean z2 = abvz.e;
                                abvw abvwVar = new abvw(bArr, 0, iA);
                                abza.a.a(adeiVar3.getClass()).m(adeiVar3, abwa.a(abvwVar));
                                abvwVar.K();
                                oatVar3.b(str, bArr);
                            } catch (IOException e) {
                                throw new RuntimeException(a.u(adeiVar3, " to a byte array threw an IOException (should never happen)."), e);
                            }
                        } else {
                            abxc abxcVar3 = adfm.b;
                            if (abxcVar3.a != adcxVar2) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            if (!adcxVar.n.n(abxcVar3.d) && (adcxVar.b & 1) != 0) {
                                oat oatVar4 = this.b;
                                abuy abuyVar = adcxVar.c;
                                if (abuyVar == null) {
                                    abuyVar = abuy.a;
                                }
                                oatVar4.b(str, abuyVar.c.B());
                            }
                        }
                    }
                } else if (i != 2) {
                    ((zdv) ((zdv) ((zdv) a.c()).o(tmm.a, this.d.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/DataStoreBatchUpdateProcessor", "process", 96, "DataStoreBatchUpdateProcessor.java")).u("Received UNKNOWN mutation type.");
                } else {
                    this.b.c(str);
                }
            }
        }
    }
}
