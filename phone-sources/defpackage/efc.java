package defpackage;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class efc implements tsv {
    private final /* synthetic */ int a;

    public /* synthetic */ efc(int i) {
        this.a = i;
    }

    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        int iHashCode;
        switch (this.a) {
            case 0:
                if (((String) obj) != null) {
                }
                break;
            case 1:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            case 2:
                if (!(obj instanceof ece)) {
                }
                break;
            case 3:
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                }
                break;
            case 4:
                xay xayVarB = xay.b(((xaz) obj).f);
                if (xayVarB == null) {
                    xayVarB = xay.ANDROID_APP;
                }
                if (xayVarB == xay.MOVIE) {
                }
                break;
            case 5:
                String str = (String) obj;
                if (str != null && ((iHashCode = str.hashCode()) == -1566805512 ? str.equals("refresh_license_delayed_forced") : !(iHashCode == 1633649344 ? !str.equals("refresh_license_forced_v2") : iHashCode != 1822784957 || !str.equals("refresh_license_periodic")))) {
                }
                break;
            case 13:
                vdi vdiVar = (vdi) obj;
                if (!vdiVar.d.isEmpty()) {
                    vdh vdhVar = vdiVar.e;
                    if (vdhVar == null) {
                        vdhVar = vdh.a;
                    }
                    int iAK = a.aK(vdhVar.c);
                    if (iAK == 0) {
                        iAK = 1;
                    }
                    if (kir.m(iAK) != kvm.TYPE_UNSPECIFIED) {
                        vdh vdhVar2 = vdiVar.e;
                        if (vdhVar2 == null) {
                            vdhVar2 = vdh.a;
                        }
                        int iAK2 = a.aK(vdhVar2.d);
                        if (iAK2 == 0) {
                            iAK2 = 1;
                        }
                        if (kir.n(iAK2) != kvn.QUALITY_UNSPECIFIED) {
                            int iAs = a.as(vdiVar.c);
                            if (iAs == 0) {
                                iAs = 1;
                            }
                            if (gag.v(iAs) != kwb.STATUS_UNSPECIFIED) {
                                vdh vdhVar3 = vdiVar.e;
                                int iAQ = a.aQ((vdhVar3 == null ? vdh.a : vdhVar3).h);
                                if (iAQ == 0) {
                                    iAQ = 1;
                                }
                                if (gag.w(iAQ) != 1) {
                                    if (vdhVar3 == null) {
                                        vdhVar3 = vdh.a;
                                    }
                                    int iAK3 = a.aK(vdhVar3.c);
                                    if (iAK3 == 0) {
                                        iAK3 = 1;
                                    }
                                    if (kir.m(iAK3) == kvm.TYPE_RENTAL) {
                                        vdm vdmVar = vdiVar.f;
                                        if (vdmVar == null) {
                                            vdmVar = vdm.a;
                                        }
                                        if (vdmVar.b != 2) {
                                            vdm vdmVar2 = vdiVar.f;
                                            if (vdmVar2 == null) {
                                                vdmVar2 = vdm.a;
                                            }
                                            if (vdmVar2.b != 1) {
                                                krd.c("Rental missing rental details.");
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    if (vdhVar3 == null) {
                                        vdhVar3 = vdh.a;
                                    }
                                    krd.c("Invalid purchase source. ".concat(Integer.toString((a.aQ(vdhVar3.h) != 0 ? r6 : 1) - 2)));
                                    break;
                                }
                            } else {
                                krd.c("Invalid purchase status. ".concat(Integer.toString((a.as(vdiVar.c) != 0 ? r6 : 1) - 2)));
                                break;
                            }
                        } else {
                            vdh vdhVar4 = vdiVar.e;
                            if (vdhVar4 == null) {
                                vdhVar4 = vdh.a;
                            }
                            krd.c("Invalid purchase quality. ".concat(Integer.toString((a.aK(vdhVar4.d) != 0 ? r6 : 1) - 2)));
                            break;
                        }
                    } else {
                        vdh vdhVar5 = vdiVar.e;
                        if (vdhVar5 == null) {
                            vdhVar5 = vdh.a;
                        }
                        krd.c("Invalid purchase type. ".concat(Integer.toString((a.aK(vdhVar5.c) != 0 ? r6 : 1) - 2)));
                        break;
                    }
                } else {
                    krd.c("Missing purchase id.");
                    break;
                }
                break;
            case 14:
                if (a.bm(((vdf) obj).b) == 3) {
                }
                break;
            case 15:
                vdf vdfVar = (vdf) obj;
                if (vdfVar.b == 2) {
                    break;
                }
                break;
            case 16:
                if (((vaj) obj).b == 12) {
                }
                break;
            case 17:
                if (a.bm(((vdf) obj).b) == 2) {
                }
                break;
        }
        return ((tst) obj).g();
    }
}
