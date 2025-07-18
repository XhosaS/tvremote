package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.google.android.gms.auth.TokenData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpy implements lie {
    public final xbw a;
    private final mem b;
    private final String c;
    private final long d;
    private String e;

    public kpy(xbw xbwVar, mem memVar, String str, long j) {
        this.a = xbwVar;
        this.b = memVar;
        this.c = str;
        this.d = j;
    }

    public static final int aC(ith ithVar) {
        if (ithVar == null) {
            return 1;
        }
        boolean zO = ithVar.o();
        boolean zP = ithVar.p();
        if (zO) {
            return 2;
        }
        return zP ? 3 : 4;
    }

    private static wik aG(ksy ksyVar) {
        return aI(ksyVar.n(), ksyVar.b);
    }

    @Deprecated
    private static wik aH(String str) {
        vtw vtwVarM = wik.a.m();
        if (str != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wik wikVar = (wik) vucVar;
            wikVar.b |= 4;
            wikVar.e = str;
            wii wiiVar = wii.YOUTUBE_ID;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wik wikVar2 = (wik) vtwVarM.b;
            wikVar2.d = wiiVar.h;
            wikVar2.b |= 2;
        }
        return (wik) vtwVarM.r();
    }

    private static wik aI(xay xayVar, String str) {
        vtw vtwVarM = wik.a.m();
        int iOrdinal = xayVar.ordinal();
        if (iOrdinal == 1) {
            wij wijVar = wij.MUSIC_ALBUM;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wik wikVar = (wik) vucVar;
            wikVar.c = wijVar.q;
            wikVar.b |= 1;
            wii wiiVar = wii.SKYJAM_ID;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wik wikVar2 = (wik) vtwVarM.b;
            wikVar2.d = wiiVar.h;
            wikVar2.b |= 2;
        } else if (iOrdinal == 17 || iOrdinal == 5) {
            wij wijVar2 = wij.MOVIE;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wik wikVar3 = (wik) vucVar2;
            wikVar3.c = wijVar2.q;
            wikVar3.b |= 1;
            wii wiiVar2 = wii.YOUTUBE_ID;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wik wikVar4 = (wik) vtwVarM.b;
            wikVar4.d = wiiVar2.h;
            wikVar4.b |= 2;
        } else if (iOrdinal != 6) {
            switch (iOrdinal) {
                case 8:
                    wij wijVar3 = wij.SHOW;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar3 = vtwVarM.b;
                    wik wikVar5 = (wik) vucVar3;
                    wikVar5.c = wijVar3.q;
                    wikVar5.b |= 1;
                    wii wiiVar3 = wii.YOUTUBE_ID;
                    if (!vucVar3.A()) {
                        vtwVarM.u();
                    }
                    wik wikVar6 = (wik) vtwVarM.b;
                    wikVar6.d = wiiVar3.h;
                    wikVar6.b |= 2;
                    break;
                case 9:
                    wij wijVar4 = wij.SEASON;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar4 = vtwVarM.b;
                    wik wikVar7 = (wik) vucVar4;
                    wikVar7.c = wijVar4.q;
                    wikVar7.b |= 1;
                    wii wiiVar4 = wii.YOUTUBE_ID;
                    if (!vucVar4.A()) {
                        vtwVarM.u();
                    }
                    wik wikVar8 = (wik) vtwVarM.b;
                    wikVar8.d = wiiVar4.h;
                    wikVar8.b |= 2;
                    break;
                case 10:
                    wij wijVar5 = wij.EPISODE;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar5 = vtwVarM.b;
                    wik wikVar9 = (wik) vucVar5;
                    wikVar9.c = wijVar5.q;
                    wikVar9.b |= 1;
                    wii wiiVar5 = wii.YOUTUBE_ID;
                    if (!vucVar5.A()) {
                        vtwVarM.u();
                    }
                    wik wikVar10 = (wik) vtwVarM.b;
                    wikVar10.d = wiiVar5.h;
                    wikVar10.b |= 2;
                    break;
                case 11:
                    wij wijVar6 = wij.VOUCHER;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar6 = vtwVarM.b;
                    wik wikVar11 = (wik) vucVar6;
                    wikVar11.c = wijVar6.q;
                    wikVar11.b |= 1;
                    wii wiiVar6 = wii.COMMERCE_ID;
                    if (!vucVar6.A()) {
                        vtwVarM.u();
                    }
                    wik wikVar12 = (wik) vtwVarM.b;
                    wikVar12.d = wiiVar6.h;
                    wikVar12.b |= 2;
                    break;
                default:
                    wij wijVar7 = wij.UNKNOWN_ASSET_TYPE;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    wik wikVar13 = (wik) vtwVarM.b;
                    wikVar13.c = wijVar7.q;
                    wikVar13.b |= 1;
                    break;
            }
        } else {
            wij wijVar8 = wij.CONTAINER;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar7 = vtwVarM.b;
            wik wikVar14 = (wik) vucVar7;
            wikVar14.c = wijVar8.q;
            wikVar14.b |= 1;
            wii wiiVar7 = wii.YOUTUBE_ID;
            if (!vucVar7.A()) {
                vtwVarM.u();
            }
            wik wikVar15 = (wik) vtwVarM.b;
            wikVar15.d = wiiVar7.h;
            wikVar15.b |= 2;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wik wikVar16 = (wik) vtwVarM.b;
        wikVar16.b |= 4;
        wikVar16.e = str;
        return (wik) vtwVarM.r();
    }

    private static wik aJ(String str, String str2, String str3, boolean z) {
        vtw vtwVarM = wik.a.m();
        if (str != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wik wikVar = (wik) vucVar;
            wikVar.b |= 4;
            wikVar.e = str;
            if (z) {
                wij wijVar = wij.TRAILER;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wik wikVar2 = (wik) vtwVarM.b;
                wikVar2.c = wijVar.q;
                wikVar2.b |= 1;
            } else if (str3 == null && str2 == null) {
                wij wijVar2 = wij.MOVIE;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wik wikVar3 = (wik) vtwVarM.b;
                wikVar3.c = wijVar2.q;
                wikVar3.b |= 1;
            } else {
                wij wijVar3 = wij.EPISODE;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wik wikVar4 = (wik) vtwVarM.b;
                wikVar4.c = wijVar3.q;
                wikVar4.b |= 1;
            }
        } else if (str3 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wik wikVar5 = (wik) vucVar2;
            wikVar5.b |= 4;
            wikVar5.e = str3;
            wij wijVar4 = wij.SEASON;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wik wikVar6 = (wik) vtwVarM.b;
            wikVar6.c = wijVar4.q;
            wikVar6.b |= 1;
        } else if (str2 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            wik wikVar7 = (wik) vucVar3;
            wikVar7.b |= 4;
            wikVar7.e = str2;
            wij wijVar5 = wij.SHOW;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            wik wikVar8 = (wik) vtwVarM.b;
            wikVar8.c = wijVar5.q;
            wikVar8.b |= 1;
        } else {
            wij wijVar6 = wij.UNKNOWN_ASSET_TYPE;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wik wikVar9 = (wik) vtwVarM.b;
            wikVar9.c = wijVar6.q;
            wikVar9.b |= 1;
        }
        vuc vucVar4 = vtwVarM.b;
        wij wijVarB = wij.b(((wik) vucVar4).c);
        if (wijVarB == null) {
            wijVarB = wij.UNKNOWN_ASSET_TYPE;
        }
        if (wijVarB != wij.UNKNOWN_ASSET_TYPE) {
            wii wiiVar = wii.YOUTUBE_ID;
            if (!vucVar4.A()) {
                vtwVarM.u();
            }
            wik wikVar10 = (wik) vtwVarM.b;
            wikVar10.d = wiiVar.h;
            wikVar10.b |= 2;
        }
        return (wik) vtwVarM.r();
    }

    private static wik aK(String str) {
        vtw vtwVarM = wik.a.m();
        if (str != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wik wikVar = (wik) vtwVarM.b;
            wikVar.b |= 4;
            wikVar.e = str;
        }
        wij wijVar = wij.MOVIE;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar2 = (wik) vucVar;
        wikVar2.c = wijVar.q;
        wikVar2.b |= 1;
        wii wiiVar = wii.EIDR_ID;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wik wikVar3 = (wik) vtwVarM.b;
        wikVar3.d = wiiVar.h;
        wikVar3.b |= 2;
        return (wik) vtwVarM.r();
    }

    private static wik aL(String str) {
        if (TextUtils.isEmpty(str)) {
            return wik.a;
        }
        vtw vtwVarM = wik.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar = (wik) vucVar;
        str.getClass();
        wikVar.b |= 4;
        wikVar.e = str;
        wij wijVar = wij.DUB_CARD;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wik wikVar2 = (wik) vucVar2;
        wikVar2.c = wijVar.q;
        wikVar2.b |= 1;
        wii wiiVar = wii.YOUTUBE_ID;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wik wikVar3 = (wik) vtwVarM.b;
        wikVar3.d = wiiVar.h;
        wikVar3.b |= 2;
        return (wik) vtwVarM.r();
    }

    private static win aM(int i, int i2, int i3, Throwable th) {
        Throwable cause = th == null ? null : th.getCause();
        vtw vtwVarM = win.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        win winVar = (win) vucVar;
        winVar.b |= 1;
        winVar.c = i;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        win winVar2 = (win) vucVar2;
        winVar2.b |= 2;
        winVar2.d = i2;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        win winVar3 = (win) vtwVarM.b;
        winVar3.b |= 64;
        winVar3.i = i3;
        String strI = jyv.i(th);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar4 = (win) vtwVarM.b;
        strI.getClass();
        winVar4.b |= 4;
        winVar4.e = strI;
        String strJ = jyv.j(th);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar5 = (win) vtwVarM.b;
        winVar5.b |= 8;
        winVar5.f = strJ;
        String strI2 = jyv.i(cause);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar6 = (win) vtwVarM.b;
        strI2.getClass();
        winVar6.b |= 16;
        winVar6.g = strI2;
        String strJ2 = jyv.j(cause);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar7 = (win) vtwVarM.b;
        winVar7.b |= 32;
        winVar7.h = strJ2;
        return (win) vtwVarM.r();
    }

    private final void aN(int i, boolean z, lih lihVar) {
        vtw vtwVarAX = aX(i, 20);
        uch uchVarAO = aO(lihVar);
        vtw vtwVarM = wiw.a.m();
        if (z) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wiw wiwVar = (wiw) vtwVarM.b;
            uchVarAO.getClass();
            wiwVar.c = uchVarAO;
            wiwVar.b |= 1;
        } else {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wiw wiwVar2 = (wiw) vtwVarM.b;
            uchVarAO.getClass();
            wiwVar2.d = uchVarAO;
            wiwVar2.b |= 2;
        }
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        wiw wiwVar3 = (wiw) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wiwVar3.getClass();
        wjaVar2.w = wiwVar3;
        wjaVar2.b |= 67108864;
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wja wjaVar3 = (wja) vtwVar.r();
        wjaVar3.getClass();
        wjmVar.d = wjaVar3;
        wjmVar.b |= 2;
        ((lhz) this.a.b()).b((wjm) vtwVarAX.r());
    }

    private static final uch aO(lih lihVar) {
        vtw vtwVarM = uch.a.m();
        int i = lihVar.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uch uchVar = (uch) vucVar;
        uchVar.b |= 1;
        uchVar.c = i;
        int i2 = lihVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        uch uchVar2 = (uch) vucVar2;
        uchVar2.b |= 2;
        uchVar2.d = i2;
        boolean z = lihVar.d;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        uch uchVar3 = (uch) vtwVarM.b;
        uchVar3.b |= 4;
        uchVar3.e = z;
        return (uch) vtwVarM.r();
    }

    private final wjm aP(int i, int i2, ieg iegVar) {
        vtw vtwVarAX = aX(i, i2);
        if (iegVar.m()) {
            wja wjaVar = ((wjm) vtwVarAX.b).d;
            if (wjaVar == null) {
                wjaVar = wja.a;
            }
            vtw vtwVar = (vtw) wjaVar.a(5, null);
            vtwVar.x(wjaVar);
            String str = (String) iegVar.g();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wja wjaVar2 = (wja) vtwVar.b;
            wjaVar2.b |= 65536;
            wjaVar2.r = str;
            wja wjaVar3 = (wja) vtwVar.r();
            if (!vtwVarAX.b.A()) {
                vtwVarAX.u();
            }
            wjm wjmVar = (wjm) vtwVarAX.b;
            wjaVar3.getClass();
            wjmVar.d = wjaVar3;
            wjmVar.b |= 2;
        }
        return (wjm) vtwVarAX.r();
    }

    private final vtw aQ(int i) {
        vtw vtwVarAD = aD();
        vtw vtwVarM = wih.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wih wihVar = (wih) vtwVarM.b;
        wihVar.b |= 1;
        wihVar.d = i;
        wih wihVar2 = (wih) vtwVarM.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wihVar2.getClass();
        wjmVar.h = wihVar2;
        wjmVar.b |= 512;
        return vtwVarAD;
    }

    private final vtw aR(int i, Throwable th) {
        return aS(i, 0, 0, th);
    }

    private final vtw aS(int i, int i2, int i3, Throwable th) {
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        win winVarAM = aM(i, i2, i3, th);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        winVarAM.getClass();
        wihVar2.e = winVarAM;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        return vtwVarAQ;
    }

    private final vtw aT(int i) {
        vtw vtwVarAD = aD();
        vtw vtwVarM = wih.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wih wihVar = (wih) vucVar;
        wihVar.b |= 1;
        wihVar.d = 32;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wih wihVar2 = (wih) vtwVarM.b;
        wihVar2.b |= 2097152;
        wihVar2.o = i;
        wih wihVar3 = (wih) vtwVarM.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        return vtwVarAD;
    }

    private final void aU(vtw vtwVar) {
        xqr xqrVarG = this.b.g();
        aW(vtwVar, xqrVarG.g(), xqrVarG.f(), xqrVarG.j());
    }

    private static void aV(vtw vtwVar, int i, String str) {
        int i2;
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 26;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 27;
                break;
            case 8:
                i2 = 6;
                break;
            case 9:
                i2 = 24;
                break;
            case 10:
                i2 = 7;
                break;
            case 11:
                i2 = 25;
                break;
            case 12:
                i2 = 8;
                break;
            case 13:
                i2 = 28;
                break;
            case 14:
                i2 = 29;
                break;
            case 15:
                i2 = 9;
                break;
            case 16:
                i2 = 10;
                break;
            case 17:
                i2 = 11;
                break;
            case 18:
                i2 = 12;
                break;
            case 19:
                i2 = 13;
                break;
            case 20:
                i2 = 14;
                break;
            case 21:
                i2 = 15;
                break;
            case 22:
                i2 = 30;
                break;
            case 23:
                i2 = 31;
                break;
            case 24:
                i2 = 16;
                break;
            case 25:
                i2 = 17;
                break;
            case 26:
                i2 = 18;
                break;
            case 27:
                i2 = 19;
                break;
            case 28:
                i2 = 20;
                break;
            case 29:
                i2 = 21;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            default:
                i2 = 0;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                i2 = 23;
                break;
            case 32:
                i2 = 32;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                i2 = 33;
                break;
            case 34:
                i2 = 34;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                i2 = 35;
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                i2 = 36;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                i2 = 37;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                i2 = 38;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                i2 = 39;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                i2 = 40;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i2 = 41;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                i2 = 42;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                i2 = 43;
                break;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar = (wih) vtwVar.b;
        wih wihVar2 = wih.a;
        wihVar.b = 16 | wihVar.b;
        wihVar.g = i2;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        str.getClass();
        wihVar3.b |= 8388608;
        wihVar3.p = str;
    }

    private static final void aW(vtw vtwVar, int i, int i2, boolean z) {
        vtw vtwVarM = ucg.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        int iL = kff.l(i);
        ucg ucgVar = (ucg) vtwVarM.b;
        ucgVar.c = iL - 1;
        ucgVar.b |= 1;
        String string = Integer.toString(i2);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ucg ucgVar2 = (ucg) vucVar;
        string.getClass();
        ucgVar2.b |= 2;
        ucgVar2.d = string;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ucg ucgVar3 = (ucg) vtwVarM.b;
        ucgVar3.b |= 4;
        ucgVar3.e = z;
        ucg ucgVar4 = (ucg) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wjm wjmVar = (wjm) vtwVar.b;
        wjm wjmVar2 = wjm.a;
        ucgVar4.getClass();
        wjmVar.k = ucgVar4;
        wjmVar.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    private final vtw aX(int i, int i2) {
        vtw vtwVarM = wja.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wja wjaVar = (wja) vtwVarM.b;
        wjaVar.c = i2 - 1;
        wjaVar.b |= 1;
        String str = this.e;
        if (str != null) {
            wje wjeVarM = kff.m(str, i);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wja wjaVar2 = (wja) vtwVarM.b;
            wjeVarM.getClass();
            wjaVar2.e = wjeVarM;
            wjaVar2.b |= 8;
        }
        vtw vtwVarAD = aD();
        wja wjaVar3 = (wja) vtwVarM.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wjaVar3.getClass();
        wjmVar.d = wjaVar3;
        wjmVar.b |= 2;
        return vtwVarAD;
    }

    @Override // defpackage.lie
    public final void A() {
        xbw xbwVar = this.a;
        ((lhz) xbwVar.b()).b((wjm) aQ(48).r());
        ((lhz) xbwVar.b()).a(mep.a);
    }

    @Override // defpackage.lie
    public final void B(String str) {
        vtw vtwVarAQ = aQ(24);
        aU(vtwVarAQ);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void C(String str, Throwable th) {
        krd.c("License Refresh error: " + str + " " + String.valueOf(th));
        vtw vtwVarAS = aS(5, 0, 0, th);
        wik wikVarAH = aH(str);
        if (!vtwVarAS.b.A()) {
            vtwVarAS.u();
        }
        wjm wjmVar = (wjm) vtwVarAS.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        aU(vtwVarAS);
        ((lhz) this.a.b()).b((wjm) vtwVarAS.r());
    }

    @Override // defpackage.lie
    public final void D(String str) {
        vtw vtwVarAQ = aQ(25);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        aU(vtwVarAQ);
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void E(String str, Throwable th) {
        krd.c("License Released error: " + str + " " + String.valueOf(th));
        vtw vtwVarAS = aS(15, 0, 0, th);
        wik wikVarAH = aH(str);
        if (!vtwVarAS.b.A()) {
            vtwVarAS.u();
        }
        wjm wjmVar = (wjm) vtwVarAS.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        aU(vtwVarAS);
        ((lhz) this.a.b()).b((wjm) vtwVarAS.r());
    }

    @Override // defpackage.lie
    public final void F(String str, String str2, ith ithVar) {
        vtw vtwVarM = wjj.a.m();
        if (str2 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wjj wjjVar = (wjj) vtwVarM.b;
            wjjVar.b |= 2;
            wjjVar.d = str2;
        }
        if (str != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wjj wjjVar2 = (wjj) vtwVarM.b;
            wjjVar2.b |= 1;
            wjjVar2.c = str;
        }
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(127);
        vtw vtwVarM2 = wir.a.m();
        int iAC = aC(ithVar);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wir wirVar = (wir) vtwVarM2.b;
        wirVar.c = iAC - 1;
        wirVar.b |= 1;
        wir wirVar2 = (wir) vtwVarM2.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wirVar2.getClass();
        wjmVar.s = wirVar2;
        wjmVar.b |= 4194304;
        wjj wjjVar3 = (wjj) vtwVarM.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wjjVar3.getClass();
        wjmVar3.q = wjjVar3;
        wjmVar3.b |= 1048576;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void G(boolean z) {
        vtw vtwVarAQ = aQ(7);
        if (z) {
            wih wihVar = ((wjm) vtwVarAQ.b).h;
            if (wihVar == null) {
                wihVar = wih.a;
            }
            vtw vtwVar = (vtw) wihVar.a(5, null);
            vtwVar.x(wihVar);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wih wihVar2 = (wih) vtwVar.b;
            wihVar2.b |= 16;
            wihVar2.g = 16;
            wih wihVar3 = (wih) vtwVar.r();
            if (!vtwVarAQ.b.A()) {
                vtwVarAQ.u();
            }
            wjm wjmVar = (wjm) vtwVarAQ.b;
            wihVar3.getClass();
            wjmVar.h = wihVar3;
            wjmVar.b |= 512;
        }
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void H(String str) {
        vtw vtwVarAQ = aQ(4);
        aU(vtwVarAQ);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void I(String str, Integer num, Throwable th, boolean z, boolean z2, int i, int i2) {
        krd.c("Pinning error: " + str + " " + num + " " + String.valueOf(th) + " " + z + " " + z2 + " " + i + " " + i2);
        vtw vtwVarAS = aS(2, i2, i, th);
        aU(vtwVarAS);
        wik wikVarAH = aH(str);
        if (!vtwVarAS.b.A()) {
            vtwVarAS.u();
        }
        wjm wjmVar = (wjm) vtwVarAS.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        vtw vtwVarM = wid.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wid widVar = (wid) vucVar;
        widVar.b |= 1;
        widVar.c = z;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wid widVar2 = (wid) vtwVarM.b;
        widVar2.b |= 2;
        widVar2.d = z2;
        if (num != null) {
            int iIntValue = num.intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wid widVar3 = (wid) vtwVarM.b;
            widVar3.b |= 4;
            widVar3.e = iIntValue;
        }
        vtw vtwVarM2 = wie.a.m();
        wid widVar4 = (wid) vtwVarM.r();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wie wieVar = (wie) vtwVarM2.b;
        widVar4.getClass();
        wieVar.e = widVar4;
        wieVar.b |= 4;
        wie wieVar2 = (wie) vtwVarM2.r();
        wih wihVar = ((wjm) vtwVarAS.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wieVar2.getClass();
        wihVar2.i = wieVar2;
        wihVar2.b |= 128;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAS.b.A()) {
            vtwVarAS.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAS.b;
        wihVar3.getClass();
        wjmVar3.h = wihVar3;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAS.r());
    }

    @Override // defpackage.lie
    public final void J(String str, int i) {
        vtw vtwVarAQ = aQ(16);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = why.a.m();
        int iK = jyv.k(i);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar = (why) vtwVarM.b;
        whyVar.c = iK - 1;
        whyVar.b |= 1;
        why whyVar2 = (why) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        whyVar2.getClass();
        wihVar2.j = whyVar2;
        wihVar2.b |= 256;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar3.h = wihVar3;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void K(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Throwable th) {
        krd.c("Playback Init error: " + str + " " + str2 + " " + str3 + " " + z + " " + z2 + " " + z3 + " " + i + " " + String.valueOf(th));
        vtw vtwVarAS = aS(1, i, (z2 ? 1 : 0) + (true != z3 ? 0 : 2), th);
        wik wikVarAJ = aJ(str, str2, str3, z);
        if (!vtwVarAS.b.A()) {
            vtwVarAS.u();
        }
        wjm wjmVar = (wjm) vtwVarAS.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        aU(vtwVarAS);
        ((lhz) this.a.b()).b((wjm) vtwVarAS.r());
    }

    @Override // defpackage.lie
    public final void L(int i, int i2, String str, String str2, String str3, String str4, boolean z, ieg iegVar, ieg iegVar2, ieg iegVar3, boolean z2) {
        vtw vtwVarAX = aX(i, 21);
        wja wjaVar = wja.a;
        vtw vtwVarM = wjaVar.m();
        if (iegVar.m()) {
            String str5 = (String) iegVar.g();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wja wjaVar2 = (wja) vtwVarM.b;
            wjaVar2.b |= 134217728;
            wjaVar2.x = str5;
        }
        if (iegVar2.m()) {
            String str6 = (String) iegVar2.g();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wja wjaVar3 = (wja) vtwVarM.b;
            wjaVar3.b |= 268435456;
            wjaVar3.y = str6;
        }
        if (iegVar3.m()) {
            String str7 = (String) iegVar3.g();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wja wjaVar4 = (wja) vtwVarM.b;
            wjaVar4.b |= 536870912;
            wjaVar4.z = str7;
        }
        int i3 = true != z2 ? 2 : 3;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wja wjaVar5 = (wja) vtwVarM.b;
        wjaVar5.A = i3 - 1;
        wjaVar5.b |= 1073741824;
        wja wjaVar6 = (wja) vtwVarM.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wjaVar6.getClass();
        wjmVar.d = wjaVar6;
        wjmVar.b |= 2;
        wik wikVarAJ = aJ(str, str2, str3, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wikVarAJ.getClass();
        wjmVar3.c = wikVarAJ;
        wjmVar3.b |= 1;
        wja wjaVar7 = wjmVar3.d;
        if (wjaVar7 != null) {
            wjaVar = wjaVar7;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar8 = (wja) vtwVar.b;
        wjaVar8.b |= 16;
        wjaVar8.f = i2;
        wik wikVarAL = aL(str4);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar9 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar9.u = wikVarAL;
        wjaVar9.b |= 4194304;
        wja wjaVar10 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar4 = (wjm) vtwVarAX.b;
        wjaVar10.getClass();
        wjmVar4.d = wjaVar10;
        wjmVar4.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void M(int i, int i2) {
        vtw vtwVarAX = aX(i, 15);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wjaVar2.b |= 256;
        wjaVar2.j = i2;
        wja wjaVar3 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar3.getClass();
        wjmVar.d = wjaVar3;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void N(int i, String str, String str2, String str3, String str4, boolean z, wiy wiyVar, idy idyVar) {
        vtw vtwVarAX = aX(i, 3);
        wik wikVarAJ = aJ(str, str2, str3, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        idyVar.c(vtwVarAX);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (wiyVar == null) {
            wiyVar = wiy.a;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wiyVar.getClass();
        wjaVar2.l = wiyVar;
        wjaVar2.b |= 1024;
        wik wikVarAL = aL(str4);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar3.u = wikVarAL;
        wjaVar3.b |= 4194304;
        wja wjaVar4 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar3.d = wjaVar4;
        wjmVar3.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
        this.e = null;
    }

    @Override // defpackage.lie
    public final void O(int i, String str, String str2, String str3, String str4, boolean z, int i2, int i3, int i4, Throwable th, idy idyVar) {
        vtw vtwVarAX = aX(i, 5);
        wik wikVarAJ = aJ(str, str2, str3, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        idyVar.c(vtwVarAX);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wjaVar2.b |= 16;
        wjaVar2.f = i2;
        win winVarAM = aM(i3, i4, 0, th);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        winVarAM.getClass();
        wjaVar3.g = winVarAM;
        wjaVar3.b |= 32;
        wik wikVarAL = aL(str4);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar4 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar4.u = wikVarAL;
        wjaVar4.b |= 4194304;
        wja wjaVar5 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wjaVar5.getClass();
        wjmVar3.d = wjaVar5;
        wjmVar3.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void P(int i, String str, String str2, String str3, String str4, boolean z, int i2, int i3, int i4, Throwable th, idy idyVar) {
        krd.c("Player error: " + i + " " + str + " " + str2 + " " + str3 + " " + str4 + " " + z + " " + i2 + " " + i3 + " " + i4 + " " + String.valueOf(th));
        vtw vtwVarAX = aX(i, 6);
        wik wikVarAJ = aJ(str, str2, str3, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        idyVar.c(vtwVarAX);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wjaVar2.b |= 16;
        wjaVar2.f = i2;
        win winVarAM = aM(i3, i4, 0, th);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        winVarAM.getClass();
        wjaVar3.g = winVarAM;
        wjaVar3.b |= 32;
        wik wikVarAL = aL(str4);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar4 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar4.u = wikVarAL;
        wjaVar4.b |= 4194304;
        wja wjaVar5 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wjaVar5.getClass();
        wjmVar3.d = wjaVar5;
        wjmVar3.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void Q(int i, int i2, int i3) {
        vtw vtwVarAX = aX(i, 10);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        int iAS = a.aS(i3);
        vuc vucVar = vtwVar.b;
        wja wjaVar2 = (wja) vucVar;
        wjaVar2.b |= 128;
        wjaVar2.i = i2;
        if (iAS != 0) {
            if (!vucVar.A()) {
                vtwVar.u();
            }
            wja wjaVar3 = (wja) vtwVar.b;
            wjaVar3.k = iAS - 1;
            wjaVar3.b |= 512;
        }
        lhz lhzVar = (lhz) this.a.b();
        wja wjaVar4 = (wja) vtwVar.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar.d = wjaVar4;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void R(int i, int i2, int i3) {
        vtw vtwVarAX = aX(i, 9);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        int iAS = a.aS(i3);
        vuc vucVar = vtwVar.b;
        wja wjaVar2 = (wja) vucVar;
        wjaVar2.b |= 128;
        wjaVar2.i = i2;
        if (iAS != 0) {
            if (!vucVar.A()) {
                vtwVar.u();
            }
            wja wjaVar3 = (wja) vtwVar.b;
            wjaVar3.k = iAS - 1;
            wjaVar3.b |= 512;
        }
        lhz lhzVar = (lhz) this.a.b();
        wja wjaVar4 = (wja) vtwVar.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar.d = wjaVar4;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void S(int i, int i2, int i3, boolean z) {
        vtw vtwVarAX = aX(i, 14);
        aW(vtwVarAX, i2, i3, z);
        ((lhz) this.a.b()).b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void T(int i, int i2, int i3, int i4) {
        vtw vtwVarAX = aX(i, 8);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        int iM = jyv.m(i2);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wja wjaVar2 = (wja) vucVar;
        wjaVar2.p = iM - 1;
        wjaVar2.b |= 16384;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        vuc vucVar2 = vtwVar.b;
        wja wjaVar3 = (wja) vucVar2;
        wjaVar3.b |= 16;
        wjaVar3.f = i3;
        if (!vucVar2.A()) {
            vtwVar.u();
        }
        wja wjaVar4 = (wja) vtwVar.b;
        wjaVar4.b |= 8192;
        wjaVar4.o = i4;
        wja wjaVar5 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar5.getClass();
        wjmVar.d = wjaVar5;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void U(int i, int i2, int i3) {
        vtw vtwVarAX = aX(i, 7);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wja wjaVar2 = (wja) vucVar;
        wjaVar2.b |= 16;
        wjaVar2.f = i3;
        int iM = jyv.m(i2);
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        wjaVar3.p = iM - 1;
        wjaVar3.b |= 16384;
        wja wjaVar4 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar.d = wjaVar4;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void V(int i, int i2, boolean z, int i3) {
        vtw vtwVarAX = aX(i, 4);
        vtw vtwVarM = wiz.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wiz wizVar = (wiz) vucVar;
        wizVar.b |= 2;
        wizVar.d = z;
        int iAV = a.aV(i3);
        if (iAV == 0) {
            iAV = 1;
        }
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wiz wizVar2 = (wiz) vtwVarM.b;
        wizVar2.c = iAV - 1;
        wizVar2.b |= 1;
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wjaVar2.b |= 16;
        wjaVar2.f = i2;
        wiz wizVar3 = (wiz) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        wizVar3.getClass();
        wjaVar3.h = wizVar3;
        wjaVar3.b |= 64;
        wja wjaVar4 = (wja) vtwVar.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar.d = wjaVar4;
        wjmVar.b |= 2;
        ((lhz) this.a.b()).b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void W(int i, ieg iegVar) {
        ((lhz) this.a.b()).b(aP(i, 12, iegVar));
    }

    @Override // defpackage.lie
    public final void X(int i, ieg iegVar) {
        ((lhz) this.a.b()).b(aP(i, 13, iegVar));
    }

    @Override // defpackage.lie
    public final void Y(int i, ieg iegVar) {
        ((lhz) this.a.b()).b(aP(i, 11, iegVar));
    }

    @Override // defpackage.lie
    public final void Z(String str, String str2) {
        vtw vtwVarAT = aT(55);
        wik wikVarAI = aI(xay.MOVIE, str);
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar = (wjm) vtwVarAT.b;
        wjm wjmVar2 = wjm.a;
        wikVarAI.getClass();
        wjmVar.c = wikVarAI;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAT.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        str2.getClass();
        wihVar2.b |= 8388608;
        wihVar2.p = str2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAT.b;
        wihVar3.getClass();
        wjmVar3.h = wihVar3;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAT.r());
    }

    @Override // defpackage.lie
    public final lid a(Context context, int i, String str) {
        lid lidVarA = lid.a();
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        vtw vtwVarM = why.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar = (why) vtwVarM.b;
        int i2 = 1;
        whyVar.c = jyv.k(1) - 1;
        whyVar.b |= 1;
        int i3 = displayMetrics.widthPixels;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar2 = (why) vtwVarM.b;
        whyVar2.b |= 2;
        whyVar2.d = i3;
        int i4 = displayMetrics.heightPixels;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar3 = (why) vtwVarM.b;
        whyVar3.b |= 4;
        whyVar3.e = i4;
        int i5 = displayMetrics.densityDpi;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar4 = (why) vtwVarM.b;
        whyVar4.b |= 8;
        whyVar4.f = i5;
        int i6 = resources.getConfiguration().orientation == 2 ? 1 : 0;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar5 = (why) vtwVarM.b;
        whyVar5.b |= 16;
        whyVar5.g = i6;
        why whyVar6 = (why) vtwVarM.r();
        vtw vtwVarAT = aT(54);
        long j = lid.a.b;
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar = (wjm) vtwVarAT.b;
        wjm wjmVar2 = wjm.a;
        wjmVar.b |= 131072;
        wjmVar.m = j;
        long j2 = lidVarA.b;
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAT.b;
        wjmVar3.b |= 65536;
        wjmVar3.l = j2;
        aU(vtwVarAT);
        wih wihVar = ((wjm) vtwVarAT.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 3;
        } else if (i == 3) {
            i2 = 5;
        } else if (i == 4) {
            i2 = 6;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.h = i2 - 1;
        wihVar2.b |= 32;
        String strE = sij.E(str);
        if (!vucVar.A()) {
            vtwVar.u();
        }
        vuc vucVar2 = vtwVar.b;
        wih wihVar3 = (wih) vucVar2;
        wihVar3.b |= 8388608;
        wihVar3.p = strE;
        if (!vucVar2.A()) {
            vtwVar.u();
        }
        wih wihVar4 = (wih) vtwVar.b;
        whyVar6.getClass();
        wihVar4.j = whyVar6;
        wihVar4.b |= 256;
        wih wihVar5 = (wih) vtwVar.r();
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar4 = (wjm) vtwVarAT.b;
        wihVar5.getClass();
        wjmVar4.h = wihVar5;
        wjmVar4.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAT.r());
        return lidVarA;
    }

    @Override // defpackage.lie
    public final void aA(int i, int i2, vwe vweVar, int i3, int i4, int i5) {
        vtw vtwVarAD = aD();
        vtw vtwVarM = wiq.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        long j = i;
        vuc vucVar = vtwVarM.b;
        wiq wiqVar = (wiq) vucVar;
        wiqVar.b |= 1;
        wiqVar.c = j;
        long j2 = i2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wiq wiqVar2 = (wiq) vucVar2;
        wiqVar2.b |= 2;
        wiqVar2.d = j2;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wiq wiqVar3 = (wiq) vucVar3;
        vweVar.getClass();
        wiqVar3.e = vweVar;
        wiqVar3.b |= 4;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        wiq wiqVar4 = (wiq) vucVar4;
        wiqVar4.f = i3 - 1;
        wiqVar4.b |= 8;
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        vuc vucVar5 = vtwVarM.b;
        wiq wiqVar5 = (wiq) vucVar5;
        wiqVar5.g = i4 - 1;
        wiqVar5.b |= 16;
        if (!vucVar5.A()) {
            vtwVarM.u();
        }
        wiq wiqVar6 = (wiq) vtwVarM.b;
        wiqVar6.b |= 32;
        wiqVar6.h = i5;
        wiq wiqVar7 = (wiq) vtwVarM.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wiqVar7.getClass();
        wjmVar.r = wiqVar7;
        wjmVar.b |= 2097152;
        ((lhz) this.a.b()).b((wjm) vtwVarAD.r());
    }

    @Override // defpackage.lie
    public final void aB(int i, ith ithVar, int i2) {
        vtw vtwVarM = wir.a.m();
        int iAC = aC(ithVar);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wir wirVar = (wir) vucVar;
        wirVar.c = iAC - 1;
        wirVar.b |= 1;
        if (i2 != 0) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wir wirVar2 = (wir) vtwVarM.b;
            wirVar2.d = i2 - 1;
            wirVar2.b |= 2;
        }
        lhz lhzVar = (lhz) this.a.b();
        int i3 = i - 1;
        vtw vtwVarAQ = aQ(i3 != 0 ? i3 != 1 ? i3 != 3 ? R.styleable.AppCompatTheme_windowFixedHeightMajor : R.styleable.AppCompatTheme_windowFixedHeightMinor : R.styleable.AppCompatTheme_windowActionModeOverlay : R.styleable.AppCompatTheme_windowActionBarOverlay);
        wir wirVar3 = (wir) vtwVarM.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wirVar3.getClass();
        wjmVar.s = wirVar3;
        wjmVar.b |= 4194304;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    public final vtw aD() {
        return kff.n(this.c, this.d);
    }

    @Override // defpackage.lie
    public final void aE(int i) {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(131);
        vtw vtwVarM = wjl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjl wjlVar = (wjl) vucVar;
        wjlVar.c = 2;
        wjlVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wjl wjlVar2 = (wjl) vucVar2;
        wjlVar2.b |= 4;
        wjlVar2.e = i;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wjl wjlVar3 = (wjl) vtwVarM.b;
        wjlVar3.d = 1;
        wjlVar3.b |= 2;
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjl wjlVar4 = (wjl) vtwVarM.r();
        wjm wjmVar2 = wjm.a;
        wjlVar4.getClass();
        wjmVar.i = wjlVar4;
        wjmVar.b |= 1024;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void aF(int i) {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(130);
        vtw vtwVarM = wjl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjl wjlVar = (wjl) vucVar;
        wjlVar.c = 1;
        wjlVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wjl wjlVar2 = (wjl) vucVar2;
        wjlVar2.b |= 4;
        wjlVar2.e = i;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wjl wjlVar3 = (wjl) vtwVarM.b;
        wjlVar3.d = 1;
        wjlVar3.b |= 2;
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjl wjlVar4 = (wjl) vtwVarM.r();
        wjm wjmVar2 = wjm.a;
        wjlVar4.getClass();
        wjmVar.i = wjlVar4;
        wjmVar.b |= 1024;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void aa(String str, Object obj) {
        vtw vtwVarAQ = aQ(23);
        vtw vtwVarM = wig.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wig wigVar = (wig) vucVar;
        str.getClass();
        wigVar.b |= 2;
        wigVar.d = str;
        if (obj instanceof String) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wig wigVar2 = (wig) vucVar2;
            wigVar2.c = 3;
            wigVar2.b = 1 | wigVar2.b;
            String str2 = (String) obj;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wig wigVar3 = (wig) vtwVarM.b;
            str2.getClass();
            wigVar3.b |= 16;
            wigVar3.g = str2;
        } else if (obj instanceof Integer) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wig wigVar4 = (wig) vtwVarM.b;
            wigVar4.c = 2;
            wigVar4.b |= 1;
            int iIntValue = ((Integer) obj).intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wig wigVar5 = (wig) vtwVarM.b;
            wigVar5.b |= 8;
            wigVar5.f = iIntValue;
        } else if (obj instanceof Boolean) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wig wigVar6 = (wig) vtwVarM.b;
            wigVar6.c = 1;
            wigVar6.b |= 1;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wig wigVar7 = (wig) vtwVarM.b;
            wigVar7.b |= 4;
            wigVar7.e = zBooleanValue;
        }
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        wig wigVar8 = (wig) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wigVar8.getClass();
        wihVar2.f = wigVar8;
        wihVar2.b |= 8;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ab(String str, String str2, String str3, boolean z, lid lidVar) {
        vtw vtwVarAT = aT(50);
        wik wikVarAJ = aJ(str, str3, str2, z);
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar = (wjm) vtwVarAT.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        long j = lidVar.b;
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAT.b;
        wjmVar3.b |= 131072;
        wjmVar3.m = j;
        ((lhz) this.a.b()).b((wjm) vtwVarAT.r());
    }

    @Override // defpackage.lie
    public final void ac(boolean z) {
        vtw vtwVarAQ = aQ(99);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        int i = true != z ? 2 : 3;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.s = i - 1;
        wihVar2.c |= 16;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        wihVar3.c |= 32;
        wihVar3.t = false;
        wih wihVar4 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ad(String str, xay xayVar) {
        vtw vtwVarAQ = aQ(5);
        wik wikVarAI = aI(xayVar, str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAI.getClass();
        wjmVar.c = wikVarAI;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wihVar2.b |= 16;
        wihVar2.g = 16;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar3.h = wihVar3;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ae() {
        vtw vtwVarAQ = aQ(R.styleable.AppCompatTheme_textAppearanceListItemSmall);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wihVar2.c |= 32;
        wihVar2.t = false;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void af(lid lidVar) {
        vtw vtwVarAT = aT(33);
        long j = lidVar.b;
        if (!vtwVarAT.b.A()) {
            vtwVarAT.u();
        }
        wjm wjmVar = (wjm) vtwVarAT.b;
        wjm wjmVar2 = wjm.a;
        wjmVar.b |= 131072;
        wjmVar.m = j;
        ((lhz) this.a.b()).b((wjm) vtwVarAT.r());
    }

    @Override // defpackage.lie
    public final void ag(String str) {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAD = aD();
        vtw vtwVarM = wih.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wih wihVar = (wih) vtwVarM.b;
        wihVar.b |= 1;
        wihVar.d = 129;
        wih wihVar2 = (wih) vtwVarM.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wihVar2.getClass();
        wjmVar.h = wihVar2;
        wjmVar.b |= 512;
        vtw vtwVarM2 = wim.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wim wimVar = (wim) vtwVarM2.b;
        wimVar.b |= 4;
        wimVar.d = str;
        wim wimVar2 = (wim) vtwVarM2.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAD.b;
        wimVar2.getClass();
        wjmVar3.g = wimVar2;
        wjmVar3.b |= 32;
        lhzVar.b((wjm) vtwVarAD.r());
    }

    @Override // defpackage.lie
    public final void ah(whl whlVar) {
        ((lhz) this.a.b()).d(whlVar);
    }

    @Override // defpackage.lie
    public final void ai(ksy ksyVar, boolean z) {
        vtw vtwVarAQ = aQ(6);
        wik wikVarAG = aG(ksyVar);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAG.getClass();
        wjmVar.c = wikVarAG;
        wjmVar.b |= 1;
        if (z) {
            wih wihVar = ((wjm) vtwVarAQ.b).h;
            if (wihVar == null) {
                wihVar = wih.a;
            }
            vtw vtwVar = (vtw) wihVar.a(5, null);
            vtwVar.x(wihVar);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wih wihVar2 = (wih) vtwVar.b;
            wihVar2.b |= 16;
            wihVar2.g = 16;
            wih wihVar3 = (wih) vtwVar.r();
            if (!vtwVarAQ.b.A()) {
                vtwVarAQ.u();
            }
            wjm wjmVar3 = (wjm) vtwVarAQ.b;
            wihVar3.getClass();
            wjmVar3.h = wihVar3;
            wjmVar3.b |= 512;
        }
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void aj(String str, int i, int i2) {
        vtw vtwVarAQ = aQ(3);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        vtw vtwVarM = wie.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wie wieVar = (wie) vucVar;
        wieVar.b |= 1;
        wieVar.c = i;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wie wieVar2 = (wie) vtwVarM.b;
        wieVar2.b |= 2;
        wieVar2.d = i2;
        wie wieVar3 = (wie) vtwVarM.r();
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wieVar3.getClass();
        wihVar2.i = wieVar3;
        wihVar2.b |= 128;
        wih wihVar3 = (wih) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar3.h = wihVar3;
        wjmVar3.b |= 512;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ak(String str) {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(6);
        wik wikVarAH = aH(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAH.getClass();
        wjmVar.c = wikVarAH;
        wjmVar.b |= 1;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void al() {
        ((lhz) this.a.b()).b((wjm) aQ(R.styleable.AppCompatTheme_windowActionBar).r());
    }

    @Override // defpackage.lie
    public final void am(wik wikVar, String str, String str2, String str3, Throwable th, ith ithVar) {
        vtw vtwVarAD = aD();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wjmVar.c = wikVar;
        wjmVar.b |= 1;
        vtw vtwVarM = wjj.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjj wjjVar = (wjj) vucVar;
        str.getClass();
        wjjVar.b |= 1;
        wjjVar.c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wjj wjjVar2 = (wjj) vucVar2;
        wjjVar2.b |= 4;
        wjjVar2.e = str2;
        if (str3 != null) {
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wjj wjjVar3 = (wjj) vtwVarM.b;
            wjjVar3.b |= 2;
            wjjVar3.d = str3;
        }
        if (th != null) {
            Throwable cause = th.getCause();
            vtw vtwVarM2 = win.a.m();
            String strI = jyv.i(th);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            win winVar = (win) vtwVarM2.b;
            strI.getClass();
            winVar.b |= 4;
            winVar.e = strI;
            String strJ = jyv.j(th);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            win winVar2 = (win) vtwVarM2.b;
            winVar2.b |= 8;
            winVar2.f = strJ;
            String strI2 = jyv.i(cause);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            win winVar3 = (win) vtwVarM2.b;
            strI2.getClass();
            winVar3.b |= 16;
            winVar3.g = strI2;
            String strJ2 = jyv.j(cause);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            win winVar4 = (win) vtwVarM2.b;
            winVar4.b |= 32;
            winVar4.h = strJ2;
            win winVar5 = (win) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wjj wjjVar4 = (wjj) vtwVarM.b;
            winVar5.getClass();
            wjjVar4.f = winVar5;
            wjjVar4.b |= 16;
        }
        int iAC = aC(ithVar);
        vtw vtwVarM3 = wir.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wir wirVar = (wir) vtwVarM3.b;
        wirVar.c = iAC - 1;
        wirVar.b |= 1;
        wir wirVar2 = (wir) vtwVarM3.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        vuc vucVar3 = vtwVarAD.b;
        wjm wjmVar3 = (wjm) vucVar3;
        wirVar2.getClass();
        wjmVar3.s = wirVar2;
        wjmVar3.b |= 4194304;
        if (!vucVar3.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar4 = (wjm) vtwVarAD.b;
        wjj wjjVar5 = (wjj) vtwVarM.r();
        wjjVar5.getClass();
        wjmVar4.q = wjjVar5;
        wjmVar4.b |= 1048576;
        ((lhz) this.a.b()).b((wjm) vtwVarAD.r());
    }

    @Override // defpackage.lie
    public final void an() {
        vtw vtwVarAQ = aQ(R.styleable.AppCompatTheme_textAppearanceListItem);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wihVar2.c |= 32;
        wihVar2.t = false;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ao(String str, xay xayVar, boolean z, int i, String str2) {
        vtw vtwVarAQ = aQ(true != z ? 35 : 34);
        wik wikVarAI = aI(xayVar, str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAI.getClass();
        wjmVar.c = wikVarAI;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        aV(vtwVar, i, str2);
        wih wihVar2 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar2.getClass();
        wjmVar3.h = wihVar2;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ap(int i) {
        int i2 = i - 1;
        ((lhz) this.a.b()).b((wjm) aQ(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 7 ? 134 : 132 : 133 : R.styleable.AppCompatTheme_windowNoTitle : R.styleable.AppCompatTheme_windowMinWidthMinor : R.styleable.AppCompatTheme_windowMinWidthMajor : R.styleable.AppCompatTheme_windowFixedWidthMinor : R.styleable.AppCompatTheme_windowFixedWidthMajor).r());
    }

    @Override // defpackage.lie
    public final void aq(ksy ksyVar, String str) {
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = win.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        win winVar = (win) vucVar;
        winVar.b |= 1;
        winVar.c = 41;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        win winVar2 = (win) vtwVarM.b;
        winVar2.b |= 256;
        winVar2.k = str;
        win winVar3 = (win) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        winVar3.getClass();
        wihVar2.e = winVar3;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        wik wikVarAG = aG(ksyVar);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar2 = (wjm) vtwVarAQ.b;
        wikVarAG.getClass();
        wjmVar2.c = wikVarAG;
        wjmVar2.b |= 1;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void ar(String str, String str2) {
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = win.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar = (win) vtwVarM.b;
        winVar.b |= 1;
        winVar.c = 41;
        String strCq = a.cq(str, str2, ":");
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        win winVar2 = (win) vtwVarM.b;
        winVar2.b |= 32;
        winVar2.h = strCq;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        win winVar3 = (win) vtwVarM.r();
        winVar3.getClass();
        wihVar2.e = winVar3;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void as(Throwable th) {
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        win winVarAM = aM(41, 0, -1, th);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        winVarAM.getClass();
        wihVar2.e = winVarAM;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void at(int i, ksy ksyVar, int i2, String str) {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(19);
        wik wikVarAG = aG(ksyVar);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAG.getClass();
        wjmVar.c = wikVarAG;
        int i3 = 1;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        aV(vtwVar, i2, str);
        wih wihVar2 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar2.getClass();
        wjmVar3.h = wihVar2;
        wjmVar3.b |= 512;
        if (i != -1) {
            wih wihVar3 = wjmVar3.h;
            if (wihVar3 == null) {
                wihVar3 = wih.a;
            }
            vtw vtwVar2 = (vtw) wihVar3.a(5, null);
            vtwVar2.x(wihVar3);
            switch (i) {
                case 1:
                    break;
                case 2:
                    i3 = 2;
                    break;
                case 3:
                    i3 = 3;
                    break;
                case 4:
                    i3 = 4;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 6:
                    i3 = 6;
                    break;
                case 7:
                    i3 = 7;
                    break;
                case 8:
                    i3 = 8;
                    break;
                case 9:
                    i3 = 9;
                    break;
                case 10:
                    i3 = 10;
                    break;
                case 11:
                    i3 = 11;
                    break;
                case 12:
                    i3 = 12;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            win winVarAM = aM(i3, 0, 0, null);
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            wih wihVar4 = (wih) vtwVar2.b;
            winVarAM.getClass();
            wihVar4.e = winVarAM;
            wihVar4.b |= 2;
            wih wihVar5 = (wih) vtwVar2.r();
            if (!vtwVarAQ.b.A()) {
                vtwVarAQ.u();
            }
            wjm wjmVar4 = (wjm) vtwVarAQ.b;
            wihVar5.getClass();
            wjmVar4.h = wihVar5;
            wjmVar4.b |= 512;
        }
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void au() {
        vtw vtwVarAQ = aQ(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.s = 2;
        wihVar2.c |= 16;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        wihVar3.c |= 32;
        wihVar3.t = false;
        wih wihVar4 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void av() {
        vtw vtwVarAQ = aQ(101);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.s = 2;
        wihVar2.c |= 16;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        wihVar3.c |= 32;
        wihVar3.t = false;
        wih wihVar4 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void aw(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, SparseArray sparseArray, idy idyVar) {
        vtw vtwVarAX = aX(0, 19);
        vtw vtwVarM = wje.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wje wjeVar = (wje) vtwVarM.b;
        str.getClass();
        wjeVar.b |= 1;
        wjeVar.c = str;
        wje wjeVar2 = (wje) vtwVarM.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wjeVar2.getClass();
        wjmVar.j = wjeVar2;
        wjmVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wik wikVarAJ = aJ(str2, str3, str4, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wikVarAJ.getClass();
        wjmVar3.c = wikVarAJ;
        wjmVar3.b |= 1;
        vtw vtwVarM2 = wix.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wix wixVar = (wix) vtwVarM2.b;
        wixVar.b |= 1024;
        wixVar.l = z2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            lih lihVar = (lih) sparseArray.valueAt(i);
            switch (iKeyAt) {
                case 2:
                    uch uchVarAO = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar2 = (wix) vtwVarM2.b;
                    uchVarAO.getClass();
                    wixVar2.c = uchVarAO;
                    wixVar2.b |= 2;
                    break;
                case 3:
                    uch uchVarAO2 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar3 = (wix) vtwVarM2.b;
                    uchVarAO2.getClass();
                    wixVar3.d = uchVarAO2;
                    wixVar3.b |= 4;
                    break;
                case 4:
                    uch uchVarAO3 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar4 = (wix) vtwVarM2.b;
                    uchVarAO3.getClass();
                    wixVar4.e = uchVarAO3;
                    wixVar4.b |= 8;
                    break;
                case 5:
                    uch uchVarAO4 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar5 = (wix) vtwVarM2.b;
                    uchVarAO4.getClass();
                    wixVar5.f = uchVarAO4;
                    wixVar5.b |= 16;
                    break;
                case 6:
                    uch uchVarAO5 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar6 = (wix) vtwVarM2.b;
                    uchVarAO5.getClass();
                    wixVar6.g = uchVarAO5;
                    wixVar6.b |= 32;
                    break;
                case 7:
                    uch uchVarAO6 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar7 = (wix) vtwVarM2.b;
                    uchVarAO6.getClass();
                    wixVar7.h = uchVarAO6;
                    wixVar7.b |= 64;
                    break;
                case 8:
                    uch uchVarAO7 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar8 = (wix) vtwVarM2.b;
                    uchVarAO7.getClass();
                    wixVar8.i = uchVarAO7;
                    wixVar8.b |= 128;
                    break;
                case 9:
                    uch uchVarAO8 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar9 = (wix) vtwVarM2.b;
                    uchVarAO8.getClass();
                    wixVar9.j = uchVarAO8;
                    wixVar9.b |= 256;
                    break;
                case 10:
                    uch uchVarAO9 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar10 = (wix) vtwVarM2.b;
                    uchVarAO9.getClass();
                    wixVar10.k = uchVarAO9;
                    wixVar10.b |= 512;
                    break;
                case 11:
                default:
                    throw new RuntimeException(a.cf(iKeyAt, "Unrecognized task type "));
                case 12:
                    uch uchVarAO10 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar11 = (wix) vtwVarM2.b;
                    uchVarAO10.getClass();
                    wixVar11.m = uchVarAO10;
                    wixVar11.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
                    break;
                case 13:
                    uch uchVarAO11 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar12 = (wix) vtwVarM2.b;
                    uchVarAO11.getClass();
                    wixVar12.n = uchVarAO11;
                    wixVar12.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    break;
                case 14:
                    uch uchVarAO12 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar13 = (wix) vtwVarM2.b;
                    uchVarAO12.getClass();
                    wixVar13.o = uchVarAO12;
                    wixVar13.b |= 8192;
                    break;
                case 15:
                    uch uchVarAO13 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar14 = (wix) vtwVarM2.b;
                    uchVarAO13.getClass();
                    wixVar14.p = uchVarAO13;
                    wixVar14.b |= 16384;
                    break;
                case 16:
                    uch uchVarAO14 = aO(lihVar);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wix wixVar15 = (wix) vtwVarM2.b;
                    uchVarAO14.getClass();
                    wixVar15.q = uchVarAO14;
                    wixVar15.b = 32768 | wixVar15.b;
                    break;
            }
        }
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wix wixVar16 = (wix) vtwVarM2.r();
        wixVar16.getClass();
        wjaVar2.q = wixVar16;
        wjaVar2.b |= 32768;
        wik wikVarAL = aL(str5);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar3.u = wikVarAL;
        wjaVar3.b |= 4194304;
        wja wjaVar4 = (wja) vtwVar.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar4 = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar4.d = wjaVar4;
        wjmVar4.b |= 2;
        idyVar.c(vtwVarAX);
        aU(vtwVarAX);
        ((lhz) this.a.b()).b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void ax(String str, String str2, String str3, String str4, String str5, boolean z, TokenData tokenData, idy idyVar) {
        Long l;
        this.e = str;
        vtw vtwVarAX = aX(0, 2);
        wik wikVarAJ = aJ(str2, str3, str4, z);
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjm wjmVar2 = wjm.a;
        wikVarAJ.getClass();
        wjmVar.c = wikVarAJ;
        wjmVar.b |= 1;
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar2 = (wja) vtwVar.b;
        wjaVar2.b |= 16;
        wjaVar2.f = 0;
        wik wikVarAL = aL(str5);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar3 = (wja) vtwVar.b;
        wikVarAL.getClass();
        wjaVar3.u = wikVarAL;
        wjaVar3.b |= 4194304;
        wja wjaVar4 = (wja) vtwVar.r();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAX.b;
        wjaVar4.getClass();
        wjmVar3.d = wjaVar4;
        wjmVar3.b |= 2;
        idyVar.c(vtwVarAX);
        if (tokenData != null && (l = tokenData.c) != null && l.longValue() - (System.currentTimeMillis() / 1000) < 18000) {
            O(0, str2, str3, str4, str5, z, 0, 32, 0, null, idyVar);
        }
        ((lhz) this.a.b()).b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void ay(ksy ksyVar, int i, boolean z, String str) {
        int i2;
        int i3;
        if (i - 1 != 1) {
            i2 = 81;
            i3 = 80;
        } else {
            i2 = 83;
            i3 = 82;
        }
        if (true == z) {
            i2 = i3;
        }
        vtw vtwVarAQ = aQ(i2);
        wik wikVarAI = aI(ksyVar.n(), ksyVar.b);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAI.getClass();
        wjmVar.c = wikVarAI;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        aV(vtwVar, 37, str);
        wih wihVar2 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar2.getClass();
        wjmVar3.h = wihVar2;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void az(wik wikVar, String str, String str2, Throwable th) {
        vtw vtwVarAD = aD();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wjmVar.c = wikVar;
        wjmVar.b |= 1;
        vtw vtwVarM = wjj.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjj wjjVar = (wjj) vucVar;
        wjjVar.b |= 1;
        wjjVar.c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wjj wjjVar2 = (wjj) vtwVarM.b;
        wjjVar2.b |= 4;
        wjjVar2.e = str2;
        Throwable cause = th.getCause();
        vtw vtwVarM2 = win.a.m();
        String strI = jyv.i(th);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        win winVar = (win) vtwVarM2.b;
        strI.getClass();
        winVar.b |= 4;
        winVar.e = strI;
        String strJ = jyv.j(th);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        win winVar2 = (win) vtwVarM2.b;
        winVar2.b |= 8;
        winVar2.f = strJ;
        String strI2 = jyv.i(cause);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        win winVar3 = (win) vtwVarM2.b;
        strI2.getClass();
        winVar3.b |= 16;
        winVar3.g = strI2;
        String strJ2 = jyv.j(cause);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        win winVar4 = (win) vtwVarM2.b;
        winVar4.b |= 32;
        winVar4.h = strJ2;
        win winVar5 = (win) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wjj wjjVar3 = (wjj) vtwVarM.b;
        winVar5.getClass();
        wjjVar3.f = winVar5;
        wjjVar3.b |= 16;
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAD.b;
        wjj wjjVar4 = (wjj) vtwVarM.r();
        wjjVar4.getClass();
        wjmVar3.q = wjjVar4;
        wjmVar3.b |= 1048576;
        ((lhz) this.a.b()).b((wjm) vtwVarAD.r());
    }

    @Override // defpackage.lie
    public final void b(Runnable runnable) {
        ((lhz) this.a.b()).a(runnable);
    }

    @Override // defpackage.lie
    public final void c(int i, lih lihVar) {
        aN(i, false, lihVar);
    }

    @Override // defpackage.lie
    public final void d(int i, lih lihVar) {
        aN(i, true, lihVar);
    }

    @Override // defpackage.lie
    public final void e(String str, String str2, String str3) {
        vtw vtwVarAQ = aQ(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = wif.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wif wifVar = (wif) vucVar;
        str.getClass();
        wifVar.b |= 1;
        wifVar.c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wif wifVar2 = (wif) vucVar2;
        wifVar2.b |= 2;
        wifVar2.d = str2;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wif wifVar3 = (wif) vtwVarM.b;
        str3.getClass();
        wifVar3.b |= 4;
        wifVar3.e = str3;
        wif wifVar4 = (wif) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wifVar4.getClass();
        wihVar2.r = wifVar4;
        wihVar2.c |= 4;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void f() {
        vtw vtwVarAQ = aQ(17);
        vtw vtwVarM = why.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        why whyVar = (why) vtwVarM.b;
        whyVar.c = 4;
        whyVar.b |= 1;
        why whyVar2 = (why) vtwVarM.r();
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        whyVar2.getClass();
        wihVar2.j = whyVar2;
        wihVar2.b |= 256;
        wih wihVar3 = (wih) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void g(List list) {
        vtw vtwVarM = wis.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wis wisVar = (wis) vtwVarM.b;
        vun vunVar = wisVar.b;
        if (!vunVar.c()) {
            wisVar.b = vuc.s(vunVar);
        }
        vsf.h(list, wisVar.b);
        wis wisVar2 = (wis) vtwVarM.r();
        vtw vtwVarM2 = wiv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wiv wivVar = (wiv) vucVar;
        wivVar.b |= 1;
        wivVar.c = 7;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        wiv wivVar2 = (wiv) vtwVarM2.b;
        wisVar2.getClass();
        wivVar2.d = wisVar2;
        wivVar2.b |= 16;
        wiv wivVar3 = (wiv) vtwVarM2.r();
        xbw xbwVar = this.a;
        lhz lhzVar = (lhz) xbwVar.b();
        vtw vtwVarAD = aD();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wivVar3.getClass();
        wjmVar.o = wivVar3;
        wjmVar.b |= 262144;
        lhzVar.b((wjm) vtwVarAD.r());
        ((lhz) xbwVar.b()).a(mep.a);
    }

    @Override // defpackage.lie
    public final void h(int i) {
        vtw vtwVarM = wit.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wit witVar = (wit) vtwVarM.b;
        witVar.b |= 1;
        witVar.c = i;
        wit witVar2 = (wit) vtwVarM.r();
        vtw vtwVarM2 = wiv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wiv wivVar = (wiv) vucVar;
        wivVar.b |= 1;
        wivVar.c = 9;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        wiv wivVar2 = (wiv) vtwVarM2.b;
        witVar2.getClass();
        wivVar2.e = witVar2;
        wivVar2.b |= 32;
        wiv wivVar3 = (wiv) vtwVarM2.r();
        xbw xbwVar = this.a;
        lhz lhzVar = (lhz) xbwVar.b();
        vtw vtwVarAD = aD();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wivVar3.getClass();
        wjmVar.o = wivVar3;
        wjmVar.b |= 262144;
        lhzVar.b((wjm) vtwVarAD.r());
        ((lhz) xbwVar.b()).a(mep.a);
    }

    @Override // defpackage.lie
    public final void i(int i) {
        vtw vtwVarM = wit.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wit witVar = (wit) vtwVarM.b;
        witVar.b |= 1;
        witVar.c = i;
        wit witVar2 = (wit) vtwVarM.r();
        vtw vtwVarM2 = wiv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wiv wivVar = (wiv) vucVar;
        wivVar.b |= 1;
        wivVar.c = 8;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        wiv wivVar2 = (wiv) vtwVarM2.b;
        witVar2.getClass();
        wivVar2.e = witVar2;
        wivVar2.b |= 32;
        wiv wivVar3 = (wiv) vtwVarM2.r();
        xbw xbwVar = this.a;
        lhz lhzVar = (lhz) xbwVar.b();
        vtw vtwVarAD = aD();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wivVar3.getClass();
        wjmVar.o = wivVar3;
        wjmVar.b |= 262144;
        lhzVar.b((wjm) vtwVarAD.r());
        ((lhz) xbwVar.b()).a(mep.a);
    }

    @Override // defpackage.lie
    public final void j(int i, qrj qrjVar, String str, String str2) {
        vtw vtwVarM = wit.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wit witVar = (wit) vtwVarM.b;
        int i2 = 1;
        witVar.b |= 1;
        witVar.c = i;
        wit witVar2 = (wit) vtwVarM.r();
        vtw vtwVarM2 = wiv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wiv wivVar = (wiv) vucVar;
        wivVar.b |= 1;
        wivVar.c = 10;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        wiv wivVar2 = (wiv) vtwVarM2.b;
        witVar2.getClass();
        wivVar2.e = witVar2;
        wivVar2.b |= 32;
        if (qrjVar != null) {
            vtw vtwVarM3 = wiu.a.m();
            Optional.ofNullable(qrjVar.a).ifPresent(new kpx(vtwVarM3, vtwVarM2, i2));
            Optional.ofNullable(qrjVar.b).ifPresent(new kpx(vtwVarM3, vtwVarM2, 0));
            Optional.ofNullable(qrjVar.c).ifPresent(new kpx(vtwVarM3, vtwVarM2, 2));
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            boolean z = qrjVar.d;
            wiu wiuVar = (wiu) vtwVarM3.b;
            wiuVar.b |= 8;
            wiuVar.f = z;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wiv wivVar3 = (wiv) vtwVarM2.b;
            wivVar3.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            wivVar3.l = z;
            wiu wiuVar2 = (wiu) vtwVarM3.r();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            wiv wivVar4 = (wiv) vucVar2;
            wiuVar2.getClass();
            wivVar4.f = wiuVar2;
            wivVar4.b |= 64;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            vuc vucVar3 = vtwVarM2.b;
            wiv wivVar5 = (wiv) vucVar3;
            wivVar5.b |= 128;
            wivVar5.g = str;
            if (!vucVar3.A()) {
                vtwVarM2.u();
            }
            wiv wivVar6 = (wiv) vtwVarM2.b;
            str2.getClass();
            wivVar6.b |= 256;
            wivVar6.h = str2;
        }
        xbw xbwVar = this.a;
        lhz lhzVar = (lhz) xbwVar.b();
        vtw vtwVarAD = aD();
        wiv wivVar7 = (wiv) vtwVarM2.r();
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wjm wjmVar2 = wjm.a;
        wivVar7.getClass();
        wjmVar.o = wivVar7;
        wjmVar.b |= 262144;
        lhzVar.b((wjm) vtwVarAD.r());
        ((lhz) xbwVar.b()).a(mep.a);
    }

    @Override // defpackage.lie
    public final void k(Throwable th) {
        ((lhz) this.a.b()).b((wjm) aR(38, th).r());
    }

    @Override // defpackage.lie
    public final void l(int i, int i2, Exception exc) {
        vtw vtwVarAR = aR(7, exc);
        wih wihVar = ((wjm) vtwVarAR.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        String string = Integer.toString(i);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        string.getClass();
        wihVar2.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        wihVar2.m = string;
        String string2 = Integer.toString(i2);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        string2.getClass();
        wihVar3.b |= 8192;
        wihVar3.n = string2;
        wih wihVar4 = (wih) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAR.b.A()) {
            vtwVarAR.u();
        }
        wjm wjmVar = (wjm) vtwVarAR.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        lhzVar.b((wjm) vtwVarAR.r());
    }

    @Override // defpackage.lie
    public final void m(int i, int i2) {
        vtw vtwVarAQ = aQ(26);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        String string = Integer.toString(i);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        string.getClass();
        wihVar2.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        wihVar2.m = string;
        String string2 = Integer.toString(i2);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        string2.getClass();
        wihVar3.b |= 8192;
        wihVar3.n = string2;
        wih wihVar4 = (wih) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void n(String str) {
        if (str == null) {
            return;
        }
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAD = aD();
        vtw vtwVarM = wim.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wim wimVar = (wim) vtwVarM.b;
        wimVar.b |= 2;
        wimVar.c = str;
        if (!vtwVarAD.b.A()) {
            vtwVarAD.u();
        }
        wjm wjmVar = (wjm) vtwVarAD.b;
        wim wimVar2 = (wim) vtwVarM.r();
        wjm wjmVar2 = wjm.a;
        wimVar2.getClass();
        wjmVar.g = wimVar2;
        wjmVar.b |= 32;
        lhzVar.b((wjm) vtwVarAD.r());
    }

    @Override // defpackage.lie
    public final void o(List list) {
        vtw vtwVarAQ = aQ(97);
        int i = 0;
        while (i < list.size()) {
            vtw vtwVarM = whz.a.m();
            String str = (String) list.get(i);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            whz whzVar = (whz) vucVar;
            str.getClass();
            whzVar.b |= 1;
            whzVar.c = str;
            i++;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            whz whzVar2 = (whz) vtwVarM.b;
            whzVar2.b |= 2;
            whzVar2.d = i;
            whz whzVar3 = (whz) vtwVarM.r();
            wih wihVar = ((wjm) vtwVarAQ.b).h;
            if (wihVar == null) {
                wihVar = wih.a;
            }
            vtw vtwVar = (vtw) wihVar.a(5, null);
            vtwVar.x(wihVar);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wih wihVar2 = (wih) vtwVar.b;
            whzVar3.getClass();
            vun vunVar = wihVar2.q;
            if (!vunVar.c()) {
                wihVar2.q = vuc.s(vunVar);
            }
            wihVar2.q.add(whzVar3);
            if (!vtwVarAQ.b.A()) {
                vtwVarAQ.u();
            }
            wjm wjmVar = (wjm) vtwVarAQ.b;
            wih wihVar3 = (wih) vtwVar.r();
            wihVar3.getClass();
            wjmVar.h = wihVar3;
            wjmVar.b |= 512;
        }
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void p(int i, int i2, boolean z) {
        vtw vtwVarAX = aX(0, 16);
        wja wjaVar = ((wjm) vtwVarAX.b).d;
        if (wjaVar == null) {
            wjaVar = wja.a;
        }
        vtw vtwVar = (vtw) wjaVar.a(5, null);
        vtwVar.x(wjaVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wja wjaVar2 = (wja) vucVar;
        wjaVar2.b |= 128;
        wjaVar2.i = i;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        vuc vucVar2 = vtwVar.b;
        wja wjaVar3 = (wja) vucVar2;
        wjaVar3.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wjaVar3.m = i2;
        if (!vucVar2.A()) {
            vtwVar.u();
        }
        wja wjaVar4 = (wja) vtwVar.b;
        wjaVar4.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        wjaVar4.n = z;
        wja wjaVar5 = (wja) vtwVar.r();
        lhz lhzVar = (lhz) this.a.b();
        if (!vtwVarAX.b.A()) {
            vtwVarAX.u();
        }
        wjm wjmVar = (wjm) vtwVarAX.b;
        wjaVar5.getClass();
        wjmVar.d = wjaVar5;
        wjmVar.b |= 2;
        lhzVar.b((wjm) vtwVarAX.r());
    }

    @Override // defpackage.lie
    public final void q(boolean z) {
        ((lhz) this.a.b()).b((wjm) aQ(true != z ? 11 : 10).r());
    }

    @Override // defpackage.lie
    public final void r() {
        ((lhz) this.a.b()).b((wjm) aQ(12).r());
    }

    @Override // defpackage.lie
    public final void s() {
        ((lhz) this.a.b()).b((wjm) aQ(49).r());
    }

    @Override // defpackage.lie
    public final void t(Exception exc) {
        ((lhz) this.a.b()).b((wjm) aR(40, exc).r());
    }

    @Override // defpackage.lie
    public final void u(int i, String str, String str2, Throwable th) {
        vtw vtwVarAQ = aQ(22);
        wik wikVarAK = aK(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAK.getClass();
        wjmVar.c = wikVarAK;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        int iL = jyv.l(i);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.l = iL - 1;
        wihVar2.b |= 1024;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        str2.getClass();
        wihVar3.b |= 8388608;
        wihVar3.p = str2;
        win winVarAM = aM(16, 0, 0, th);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar4 = (wih) vtwVar.b;
        winVarAM.getClass();
        wihVar4.e = winVarAM;
        wihVar4.b |= 2;
        wih wihVar5 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar5.getClass();
        wjmVar3.h = wihVar5;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void v(int i, String str, String str2) {
        vtw vtwVarAQ = aQ(22);
        wik wikVarAK = aK(str);
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wjm wjmVar2 = wjm.a;
        wikVarAK.getClass();
        wjmVar.c = wikVarAK;
        wjmVar.b |= 1;
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        int iL = jyv.l(i);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.l = iL - 1;
        wihVar2.b |= 1024;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        str2.getClass();
        wihVar3.b |= 8388608;
        wihVar3.p = str2;
        wih wihVar4 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar3 = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar3.h = wihVar4;
        wjmVar3.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void w(String str) {
        vtw vtwVarAQ = aQ(22);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wih wihVar2 = (wih) vucVar;
        wihVar2.l = 5;
        wihVar2.b |= 1024;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wih wihVar3 = (wih) vtwVar.b;
        str.getClass();
        wihVar3.b |= 8388608;
        wihVar3.p = str;
        wih wihVar4 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar4.getClass();
        wjmVar.h = wihVar4;
        wjmVar.b |= 512;
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void x(ieg iegVar) {
        if (iegVar.m()) {
            return;
        }
        Throwable thI = iegVar.i();
        int iA = krm.a(thI);
        Throwable cause = thI.getCause();
        StringBuilder sb = new StringBuilder();
        int i = 10;
        while (cause != null) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append((Object) jyv.h(krm.a(cause)));
            sb.append(':');
            sb.append(cause.getMessage());
            cause = cause.getCause();
            i = i2;
        }
        String string = sb.toString();
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = win.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        win winVar = (win) vucVar;
        winVar.b |= 1;
        winVar.c = 36;
        int i3 = iA - 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        win winVar2 = (win) vtwVarM.b;
        winVar2.b |= 2;
        winVar2.d = i3;
        String str = jyv.h(iA) + ":" + thI.getMessage();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        win winVar3 = (win) vucVar2;
        winVar3.b |= 8;
        winVar3.f = str;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        win winVar4 = (win) vtwVarM.b;
        winVar4.b |= 32;
        winVar4.h = string;
        win winVar5 = (win) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        winVar5.getClass();
        wihVar2.e = winVar5;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        aU(vtwVarAQ);
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void y() {
        lhz lhzVar = (lhz) this.a.b();
        vtw vtwVarAQ = aQ(21);
        vtw vtwVarM = wib.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wib wibVar = (wib) vtwVarM.b;
        wibVar.c = 1;
        wibVar.b = 1 | wibVar.b;
        wib wibVar2 = (wib) vtwVarM.r();
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        wibVar2.getClass();
        wihVar2.k = wibVar2;
        wihVar2.b |= 512;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        lhzVar.b((wjm) vtwVarAQ.r());
    }

    @Override // defpackage.lie
    public final void z(String str) {
        vtw vtwVarAQ = aQ(36);
        wih wihVar = ((wjm) vtwVarAQ.b).h;
        if (wihVar == null) {
            wihVar = wih.a;
        }
        vtw vtwVar = (vtw) wihVar.a(5, null);
        vtwVar.x(wihVar);
        vtw vtwVarM = win.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        win winVar = (win) vucVar;
        winVar.b |= 1;
        winVar.c = 35;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        win winVar2 = (win) vtwVarM.b;
        str.getClass();
        winVar2.b |= 128;
        winVar2.j = str;
        win winVar3 = (win) vtwVarM.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wih wihVar2 = (wih) vtwVar.b;
        winVar3.getClass();
        wihVar2.e = winVar3;
        wihVar2.b |= 2;
        wih wihVar3 = (wih) vtwVar.r();
        if (!vtwVarAQ.b.A()) {
            vtwVarAQ.u();
        }
        wjm wjmVar = (wjm) vtwVarAQ.b;
        wihVar3.getClass();
        wjmVar.h = wihVar3;
        wjmVar.b |= 512;
        aU(vtwVarAQ);
        ((lhz) this.a.b()).b((wjm) vtwVarAQ.r());
    }
}
