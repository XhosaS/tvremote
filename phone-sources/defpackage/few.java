package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class few implements feq {
    public final ImmutableList a;
    public final int b;

    private few(int i, ImmutableList immutableList) {
        this.b = i;
        this.a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static few c(int i, edi ediVar) {
        feq fexVar;
        String str;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = ediVar.c;
        int iB = -2;
        while (ediVar.a() > 8) {
            int iF = ediVar.f();
            int iF2 = ediVar.b + ediVar.f();
            ediVar.J(iF2);
            if (iF != 1414744396) {
                switch (iF) {
                    case 1718776947:
                        if (iB == 2) {
                            ediVar.L(4);
                            int iF3 = ediVar.f();
                            int iF4 = ediVar.f();
                            ediVar.L(4);
                            int iF5 = ediVar.f();
                            switch (iF5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                dzd dzdVar = new dzd();
                                dzdVar.t = iF3;
                                dzdVar.u = iF4;
                                dzdVar.d(str);
                                fexVar = new fex(new dze(dzdVar));
                                break;
                            } else {
                                edb.e("StreamFormatChunk", a.cf(iF5, "Ignoring track with unsupported compression "));
                                fexVar = null;
                                break;
                            }
                        } else {
                            if (iB == 1) {
                                int iH = ediVar.h();
                                String str2 = iH != 1 ? iH != 85 ? iH != 255 ? iH != 8192 ? iH != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iH2 = ediVar.h();
                                    int iF6 = ediVar.f();
                                    ediVar.L(6);
                                    int iN = edt.n(ediVar.h());
                                    int iH3 = ediVar.a() > 0 ? ediVar.h() : 0;
                                    dzd dzdVar2 = new dzd();
                                    dzdVar2.d(str2);
                                    dzdVar2.E = iH2;
                                    dzdVar2.F = iF6;
                                    if (str2.equals("audio/raw") && iN != 0) {
                                        dzdVar2.G = iN;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iH3 > 0) {
                                        byte[] bArr = new byte[iH3];
                                        ediVar.F(bArr, 0, iH3);
                                        dzdVar2.p = ImmutableList.of(bArr);
                                    }
                                    fexVar = new fex(new dze(dzdVar2));
                                    break;
                                } else {
                                    edb.e("StreamFormatChunk", a.cf(iH, "Ignoring track with unsupported format tag "));
                                }
                            } else {
                                edb.e("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(edt.Y(iB)));
                            }
                            fexVar = null;
                        }
                    case 1751742049:
                        int iF7 = ediVar.f();
                        ediVar.L(8);
                        int iF8 = ediVar.f();
                        int iF9 = ediVar.f();
                        ediVar.L(4);
                        ediVar.f();
                        ediVar.L(12);
                        fexVar = new fet(iF7, iF8, iF9);
                        break;
                    case 1752331379:
                        int iF10 = ediVar.f();
                        ediVar.L(12);
                        ediVar.f();
                        int iF11 = ediVar.f();
                        int iF12 = ediVar.f();
                        ediVar.L(4);
                        int iF13 = ediVar.f();
                        int iF14 = ediVar.f();
                        ediVar.L(4);
                        fexVar = new feu(iF10, iF11, iF12, iF13, iF14, ediVar.f());
                        break;
                    case 1852994675:
                        fexVar = new fey(ediVar.y(ediVar.a()));
                        break;
                    default:
                        fexVar = null;
                        break;
                }
            } else {
                fexVar = c(ediVar.f(), ediVar);
            }
            if (fexVar != null) {
                if (fexVar.a() == 1752331379) {
                    iB = ((feu) fexVar).b();
                }
                builder.add((ImmutableList.Builder) fexVar);
            }
            ediVar.K(iF2);
            ediVar.J(i2);
        }
        return new few(i, builder.build());
    }

    @Override // defpackage.feq
    public final int a() {
        return this.b;
    }

    public final feq b(Class cls) {
        UnmodifiableIterator it = this.a.iterator();
        while (it.hasNext()) {
            feq feqVar = (feq) it.next();
            if (feqVar.getClass() == cls) {
                return feqVar;
            }
        }
        return null;
    }
}
