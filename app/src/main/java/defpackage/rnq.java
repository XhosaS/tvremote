package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnq {
    public final String a;
    final /* synthetic */ rnr b;
    private final yrp c;

    public rnq(rnr rnrVar, String str, final int i, final int i2) {
        this.b = rnrVar;
        this.a = str;
        this.c = new rnm(new yrp() { // from class: rnp
            @Override // defpackage.yrp
            public final Object eV() throws Resources.NotFoundException {
                int iA;
                aagy aagyVar = aagy.a;
                aagw aagwVar = new aagw();
                rnq rnqVar = this.a;
                int i3 = i;
                try {
                    rnr rnrVar2 = rnqVar.b;
                    Resources resourcesA = rnrVar2.a();
                    if (resourcesA == null) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from " + rnqVar.b.a);
                        return null;
                    }
                    try {
                        rnqVar.b(aagwVar, resourcesA, i3);
                        long jLongValue = ((Long) rnrVar2.c.eV()).longValue();
                        if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aagwVar.y();
                        }
                        aagy aagyVar2 = (aagy) aagwVar.b;
                        aagyVar2.b |= 128;
                        aagyVar2.l = jLongValue;
                        String strB = rns.b(aagyVar2.g);
                        String str2 = rnqVar.a;
                        yqw.R(strB.equals(str2), "Resource package does not match expected package, expected package: %s", str2);
                        aagy aagyVar3 = (aagy) aagwVar.b;
                        String strI = aagyVar3.g;
                        rnr rnrVar3 = rnqVar.b;
                        boolean z = aagyVar3.h;
                        if (strI.isEmpty()) {
                            throw new IllegalArgumentException("Empty configuration package");
                        }
                        String str3 = rnrVar3.a;
                        if (z) {
                            if (strI.indexOf(35) >= 0) {
                                throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', strI));
                            }
                            strI = a.i(str3, strI, "#");
                        }
                        if (((aagy) aagwVar.b).c != 2) {
                            Integer num = (Integer) rnrVar3.d.eV();
                            num.intValue();
                            if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aagwVar.y();
                            }
                            aagy aagyVar4 = (aagy) aagwVar.b;
                            aagyVar4.c = 2;
                            aagyVar4.d = num;
                        }
                        if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aagwVar.y();
                        }
                        aagy aagyVar5 = (aagy) aagwVar.b;
                        strI.getClass();
                        aagyVar5.b |= 1;
                        aagyVar5.g = strI;
                        if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aagwVar.y();
                        }
                        aagy aagyVar6 = (aagy) aagwVar.b;
                        str3.getClass();
                        aagyVar6.e = 7;
                        aagyVar6.f = str3;
                        if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aagwVar.y();
                        }
                        int i4 = i2;
                        aagy aagyVar7 = (aagy) aagwVar.b;
                        aagyVar7.k = 3;
                        aagyVar7.b |= 32;
                        if (i4 == 0) {
                            return (aagy) aagwVar.v();
                        }
                        rnk rnkVar = rnk.a;
                        rnj rnjVar = new rnj();
                        try {
                            rnqVar.b(rnjVar, resourcesA, i4);
                            String str4 = ((rnk) rnjVar.b).c;
                            String str5 = rnqVar.a;
                            yqw.ai(str4.equals(str5), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((rnk) rnjVar.b).c, str5);
                            if ((rnjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                rnjVar.y();
                            }
                            rnk rnkVar2 = (rnk) rnjVar.b;
                            rnkVar2.b &= -2;
                            rnkVar2.c = rnk.a.c;
                            rnk rnkVar3 = (rnk) rnjVar.v();
                            try {
                                int i5 = rnkVar3.memoizedSerializedSize;
                                if ((i5 & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(rnkVar3.getClass()).a(rnkVar3);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i5 & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(rnkVar3.getClass()).a(rnkVar3);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        rnkVar3.memoizedSerializedSize = (rnkVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                    }
                                }
                                abvo abvoVar = abvo.b;
                                byte[] bArr = new byte[iA];
                                boolean z2 = abvz.e;
                                abvw abvwVar = new abvw(bArr, 0, iA);
                                abza.a.a(rnkVar3.getClass()).m(rnkVar3, abwa.a(abvwVar));
                                abvo abvoVarA = abvk.a(abvwVar, bArr);
                                if ((aagwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    aagwVar.y();
                                }
                                aagy aagyVar8 = (aagy) aagwVar.b;
                                aagyVar8.b |= 256;
                                aagyVar8.m = abvoVarA;
                                return (aagy) aagwVar.v();
                            } catch (IOException e) {
                                throw new RuntimeException(a.u(rnkVar3, " to a ByteString threw an IOException (should never happen)."), e);
                            }
                        } catch (IOException unused) {
                            Log.i("PhenotypeResourceReader", "Failed to read Phenotype HeterodyneInfo resources from ".concat(String.valueOf(rnqVar.b.a)));
                            return null;
                        }
                    } catch (IOException | NullPointerException unused2) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(rnqVar.b.a)));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(rnqVar.b.a)));
                }
            }
        });
    }

    public final aagy a() {
        return (aagy) this.c.eV();
    }

    public final void b(abyq abyqVar, Resources resources, int i) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            this.b.f.b++;
            abvt abvtVarK = abvt.K(inputStreamOpenRawResource, Math.max(512, Math.min(4096, inputStreamOpenRawResource.available())));
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            abyqVar.o(abvtVarK, ExtensionRegistryLite.a);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
