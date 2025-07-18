package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkt extends hkk implements fat {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/medialist/MediaBrowseItem");
    private final xly e;
    private final xmk f;
    private final xal g;
    private adxk h;
    private xkc i;
    private yyk j;
    private Intent k;
    private final int l;
    private final int m;
    private final boolean n;
    private final String o;
    private final acjc p;

    public hkt(int i, xly xlyVar, int i2, int i3, String str, acjc acjcVar) {
        super(i);
        this.e = xlyVar;
        xmk xmkVar = xlyVar.g;
        xmkVar = xmkVar == null ? xmk.a : xmkVar;
        this.f = xmkVar;
        xal xalVar = xmkVar.l;
        xalVar = xalVar == null ? xal.a : xalVar;
        this.g = xalVar;
        int i4 = xalVar.b;
        i2 = (i4 & 256) != 0 ? xalVar.g : i2;
        i3 = (i4 & 128) != 0 ? xalVar.f : i3;
        this.l = i2;
        this.m = i3;
        this.n = true;
        this.o = str;
        this.p = acjcVar;
    }

    static boolean D(xmj xmjVar) {
        return xmjVar == xmj.ALBUM || xmjVar == xmj.ARTIST || xmjVar == xmj.MOVIE || xmjVar == xmj.TRACK || xmjVar == xmj.MUSIC_GENRE || xmjVar == xmj.MUSIC_MIX || xmjVar == xmj.PLAYLIST || xmjVar == xmj.TV_SHOW || xmjVar == xmj.SPORTS_EVENT || xmjVar == xmj.VIDEO || xmjVar == xmj.YOUTUBE_VIDEO_PLAYLIST || xmjVar == xmj.YOUTUBE_CHANNEL;
    }

    private final boolean F() {
        xmk xmkVar = this.f;
        int i = xmkVar.k;
        xmj xmjVarB = xmj.b(i);
        if (xmjVarB == null) {
            xmjVarB = xmj.UNKNOWN;
        }
        if (xmjVarB != xmj.ALBUM) {
            xmj xmjVarB2 = xmj.b(i);
            if (xmjVarB2 == null) {
                xmjVarB2 = xmj.UNKNOWN;
            }
            if (xmjVarB2 != xmj.ARTIST) {
                xmj xmjVarB3 = xmj.b(i);
                if (xmjVarB3 == null) {
                    xmjVarB3 = xmj.UNKNOWN;
                }
                if (xmjVarB3 != xmj.MUSIC_GENRE) {
                    xmj xmjVarB4 = xmj.b(i);
                    if (xmjVarB4 == null) {
                        xmjVarB4 = xmj.UNKNOWN;
                    }
                    if (xmjVarB4 != xmj.MUSIC_MIX) {
                        xmj xmjVarB5 = xmj.b(i);
                        if (xmjVarB5 == null) {
                            xmjVarB5 = xmj.UNKNOWN;
                        }
                        if (xmjVarB5 != xmj.PLAYLIST) {
                            xmj xmjVarB6 = xmj.b(i);
                            if (xmjVarB6 == null) {
                                xmjVarB6 = xmj.UNKNOWN;
                            }
                            if (xmjVarB6 != xmj.YOUTUBE_VIDEO_PLAYLIST) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return xmkVar.j > 0;
    }

    @Override // defpackage.hkk
    public final boolean B() {
        xmj xmjVarB = xmj.b(this.f.k);
        if (xmjVarB == null) {
            xmjVarB = xmj.UNKNOWN;
        }
        return xmjVarB.equals(xmj.MOVIE) || xmjVarB.equals(xmj.TV_SHOW);
    }

    @Override // defpackage.hkk
    public final int C() {
        if (F()) {
            int iA = xlx.a(this.e.j);
            if (iA == 0) {
                iA = 1;
            }
            int i = iA - 1;
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
        }
        return 1;
    }

    final boolean E() {
        xmj xmjVarB = xmj.b(this.f.k);
        if (xmjVarB == null) {
            xmjVarB = xmj.UNKNOWN;
        }
        return D(xmjVarB);
    }

    @Override // defpackage.hkk
    public final int a() {
        return this.l;
    }

    @Override // defpackage.hkk
    public final int b() {
        return this.m;
    }

    @Override // defpackage.hkk
    public final int c() {
        return (this.e.b & 1) != 0 ? 13891 : 13893;
    }

    @Override // defpackage.hkk
    public final Intent d() {
        xly xlyVar = this.e;
        if ((xlyVar.b & 1) == 0) {
            return null;
        }
        if (this.k == null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(xlyVar.e));
            this.k = intent;
            intent.setFlags(335544320);
            xbg xbgVar = xlyVar.f;
            if (xbgVar == null) {
                xbgVar = xbg.a;
            }
            String str = (xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c;
            if (!str.isEmpty()) {
                this.k.setPackage(str);
            }
            xbg xbgVar2 = xlyVar.f;
            if (xbgVar2 == null) {
                xbgVar2 = xbg.a;
            }
            if ((xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).h) {
                this.k.putExtra("is_broadcast_intent", true);
            }
        }
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fat
    public final xkc dA() throws abxv {
        xkc xkcVar = this.i;
        if (xkcVar != null) {
            return xkcVar;
        }
        if (dG()) {
            try {
                xly xlyVar = this.e;
                xgw xgwVar = (xlyVar.c == 16 ? (xan) xlyVar.d : xan.a).c;
                if (xgwVar == null) {
                    xgwVar = xgw.a;
                }
                xjp xjpVar = xjp.a;
                abyl abylVar = xgwVar.d;
                if (abylVar.containsKey("tap_input")) {
                    xjpVar = (xjp) abylVar.get("tap_input");
                }
                abvo abvoVar = xjpVar.d;
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                xkc xkcVar2 = xkc.a;
                abvt abvtVarK = abvoVar.k();
                xkc xkcVar3 = new xkc();
                try {
                    try {
                        try {
                            try {
                                abzj abzjVarA = abza.a.a(xkcVar3.getClass());
                                abzjVarA.i(xkcVar3, abvu.p(abvtVarK), generatedRegistry);
                                abzjVarA.g(xkcVar3);
                                try {
                                    abvtVarK.z(0);
                                    Byte b = (byte) 1;
                                    b.getClass();
                                    this.i = xkcVar3;
                                } catch (abxv e) {
                                    throw e;
                                }
                            } catch (RuntimeException e2) {
                                if (e2.getCause() instanceof abxv) {
                                    throw ((abxv) e2.getCause());
                                }
                                throw e2;
                            }
                        } catch (abxv e3) {
                            if (e3.a) {
                                throw new abxv(e3);
                            }
                            throw e3;
                        }
                    } catch (abzz e4) {
                        throw e4.a();
                    }
                } catch (IOException e5) {
                    if (e5.getCause() instanceof abxv) {
                        throw ((abxv) e5.getCause());
                    }
                    throw new abxv(e5);
                }
            } catch (abxv e6) {
                ((zdv) ((zdv) ((zdv) a.c()).p(e6)).q("com/google/android/apps/tvsearch/results/medialist/MediaBrowseItem", "getTapInput", (char) 373, "MediaBrowseItem.java")).u("Failed to parse TapInput.");
                this.i = xkc.a;
            }
        } else {
            this.i = xkc.a;
        }
        return this.i;
    }

    @Override // defpackage.fat
    public final xmj dB() {
        xmj xmjVarB = xmj.b(this.f.k);
        return xmjVarB == null ? xmj.UNKNOWN : xmjVarB;
    }

    @Override // defpackage.fat
    public final adxk dC() {
        if (this.h == null) {
            xly xlyVar = this.e;
            xmk xmkVar = this.f;
            adxk adxkVar = adxk.a;
            adxh adxhVar = new adxh();
            int i = xmkVar.k;
            xmj xmjVarB = xmj.b(i);
            if (xmjVarB == null) {
                xmjVarB = xmj.UNKNOWN;
            }
            if (xmjVarB == xmj.MOVIE) {
                adxj adxjVar = adxj.MOVIE;
                if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adxhVar.y();
                }
                adxk adxkVar2 = (adxk) adxhVar.b;
                adxkVar2.c = adxjVar.g;
                adxkVar2.b |= 1;
            } else {
                xmj xmjVarB2 = xmj.b(i);
                if (xmjVarB2 == null) {
                    xmjVarB2 = xmj.UNKNOWN;
                }
                if (xmjVarB2 == xmj.TV_SHOW) {
                    adxj adxjVar2 = adxj.TV_SHOW;
                    if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adxhVar.y();
                    }
                    adxk adxkVar3 = (adxk) adxhVar.b;
                    adxkVar3.c = adxjVar2.g;
                    adxkVar3.b |= 1;
                } else {
                    xmj xmjVarB3 = xmj.b(i);
                    if (xmjVarB3 == null) {
                        xmjVarB3 = xmj.UNKNOWN;
                    }
                    if (xmjVarB3 == xmj.VIDEO) {
                        adxj adxjVar3 = adxj.VIDEO;
                        if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            adxhVar.y();
                        }
                        adxk adxkVar4 = (adxk) adxhVar.b;
                        adxkVar4.c = adxjVar3.g;
                        adxkVar4.b |= 1;
                    }
                }
            }
            if ((xmkVar.b & 524288) != 0) {
                String str = xmkVar.p;
                if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adxhVar.y();
                }
                adxk adxkVar5 = (adxk) adxhVar.b;
                str.getClass();
                adxkVar5.b |= 2;
                adxkVar5.d = str;
            }
            if ((xmkVar.b & 1) != 0) {
                String str2 = xmkVar.e;
                if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adxhVar.y();
                }
                adxk adxkVar6 = (adxk) adxhVar.b;
                str2.getClass();
                adxkVar6.b |= 8;
                adxkVar6.e = str2;
            }
            if ((xlyVar.b & 1024) != 0) {
                xjp xjpVar = xlyVar.k;
                if (xjpVar == null) {
                    xjpVar = xjp.a;
                }
                if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adxhVar.y();
                }
                adxk adxkVar7 = (adxk) adxhVar.b;
                xjpVar.getClass();
                adxkVar7.f = xjpVar;
                adxkVar7.b |= 64;
            }
            xbg xbgVar = xlyVar.f;
            if (xbgVar == null) {
                xbgVar = xbg.a;
            }
            if (((xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).b & 1) != 0) {
                xbg xbgVar2 = xlyVar.f;
                if (xbgVar2 == null) {
                    xbgVar2 = xbg.a;
                }
                if (!(xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).c.isEmpty()) {
                    xbg xbgVar3 = xlyVar.f;
                    if (xbgVar3 == null) {
                        xbgVar3 = xbg.a;
                    }
                    String str3 = (xbgVar3.b == 1 ? (xaq) xbgVar3.c : xaq.a).c;
                    if ((adxhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adxhVar.y();
                    }
                    adxk adxkVar8 = (adxk) adxhVar.b;
                    str3.getClass();
                    adxkVar8.b |= 128;
                    adxkVar8.g = str3;
                }
            }
            this.h = (adxk) adxhVar.v();
        }
        return this.h;
    }

    @Override // defpackage.fat
    public final String dD() {
        return null;
    }

    @Override // defpackage.fat
    public final boolean dE() {
        return true;
    }

    @Override // defpackage.fat
    public final boolean dF() {
        return true;
    }

    @Override // defpackage.fat
    public final boolean dG() {
        xly xlyVar = this.e;
        if (((xlyVar.c == 16 ? (xan) xlyVar.d : xan.a).b & 8) == 0) {
            return false;
        }
        xgw xgwVar = (xlyVar.c == 16 ? (xan) xlyVar.d : xan.a).c;
        if (xgwVar == null) {
            xgwVar = xgw.a;
        }
        return xgwVar.d.containsKey("tap_input");
    }

    @Override // defpackage.fat
    public final EntityInfo dz() {
        return new EntityInfo(this.f.e, q(), null, null, "");
    }

    @Override // defpackage.hkk
    public final Duration e() {
        return Duration.ofSeconds(this.f.n);
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String f() {
        return this.f.e;
    }

    @Override // defpackage.hkk
    public final String g() {
        return this.g.c;
    }

    @Override // defpackage.hkk
    public final boolean h() {
        return (this.g.b & 2) != 0;
    }

    @Override // defpackage.hkk
    public final pan i() {
        pan panVarI = super.i();
        acjc acjcVar = this.p;
        if (acjcVar != null) {
            panVarI.d(acjcVar);
        }
        return panVarI;
    }

    @Override // defpackage.fat
    public final boolean j() {
        return false;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String k() {
        return this.f.p;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String l() {
        return this.o;
    }

    @Override // defpackage.hkk
    public final String p() {
        return this.f.s;
    }

    @Override // defpackage.hkk
    public final String q() {
        return this.f.h.replace("\n", " • ");
    }

    @Override // defpackage.hkk
    public final String s() {
        return F() ? this.e.i : this.c;
    }

    @Override // defpackage.hkk
    public final /* bridge */ /* synthetic */ List t() {
        xmk xmkVar = this.f;
        if (xmkVar.q.size() > 0 && this.j == null) {
            abxs<xmg> abxsVar = xmkVar.q;
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            for (xmg xmgVar : abxsVar) {
                aeax aeaxVar = aeax.a;
                aeaw aeawVar = new aeaw();
                if ((xmgVar.b & 2) != 0) {
                    String str = xmgVar.c;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar2 = (aeax) aeawVar.b;
                    str.getClass();
                    aeaxVar2.b |= 1;
                    aeaxVar2.c = str;
                }
                if ((xmgVar.b & 4) != 0) {
                    xal xalVar = xmgVar.d;
                    if (xalVar == null) {
                        xalVar = xal.a;
                    }
                    String str2 = xalVar.c;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar3 = (aeax) aeawVar.b;
                    str2.getClass();
                    aeaxVar3.b |= 2;
                    aeaxVar3.d = str2;
                    int i2 = xalVar.f;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar4 = (aeax) aeawVar.b;
                    aeaxVar4.b |= 8;
                    aeaxVar4.e = i2;
                    int i3 = xalVar.g;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar5 = (aeax) aeawVar.b;
                    aeaxVar5.b |= 16;
                    aeaxVar5.f = i3;
                }
                if ((xmgVar.b & 64) != 0) {
                    int i4 = xmgVar.h;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar6 = (aeax) aeawVar.b;
                    aeaxVar6.b |= 256;
                    aeaxVar6.j = i4;
                }
                if ((xmgVar.b & 32) != 0) {
                    int i5 = xmgVar.g;
                    if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeawVar.y();
                    }
                    aeax aeaxVar7 = (aeax) aeawVar.b;
                    aeaxVar7.b |= 128;
                    aeaxVar7.i = i5;
                }
                if ((xmgVar.b & 8) != 0) {
                    int iA = xmc.a(xmgVar.e);
                    if (iA == 0) {
                        iA = 1;
                    }
                    switch (iA - 1) {
                        case 1:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar8 = (aeax) aeawVar.b;
                            aeaxVar8.g = 1;
                            aeaxVar8.b |= 32;
                            break;
                        case 2:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar9 = (aeax) aeawVar.b;
                            aeaxVar9.g = 2;
                            aeaxVar9.b |= 32;
                            break;
                        case 3:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar10 = (aeax) aeawVar.b;
                            aeaxVar10.g = 3;
                            aeaxVar10.b |= 32;
                            break;
                        case 4:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar11 = (aeax) aeawVar.b;
                            aeaxVar11.g = 4;
                            aeaxVar11.b |= 32;
                            break;
                        case 5:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar12 = (aeax) aeawVar.b;
                            aeaxVar12.g = 5;
                            aeaxVar12.b |= 32;
                            break;
                        case 6:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar13 = (aeax) aeawVar.b;
                            aeaxVar13.g = 6;
                            aeaxVar13.b |= 32;
                            break;
                        case 7:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar14 = (aeax) aeawVar.b;
                            aeaxVar14.g = 7;
                            aeaxVar14.b |= 32;
                            break;
                        default:
                            if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeawVar.y();
                            }
                            aeax aeaxVar15 = (aeax) aeawVar.b;
                            aeaxVar15.g = 0;
                            aeaxVar15.b |= 32;
                            break;
                    }
                }
                if ((xmgVar.b & 16) != 0) {
                    int iA2 = xme.a(xmgVar.f);
                    if (iA2 == 0) {
                        iA2 = 2;
                    }
                    int i6 = iA2 - 1;
                    if (i6 == 1) {
                        if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeawVar.y();
                        }
                        aeax aeaxVar16 = (aeax) aeawVar.b;
                        aeaxVar16.h = 1;
                        aeaxVar16.b |= 64;
                    } else if (i6 == 2) {
                        if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeawVar.y();
                        }
                        aeax aeaxVar17 = (aeax) aeawVar.b;
                        aeaxVar17.h = 2;
                        aeaxVar17.b |= 64;
                    } else if (i6 == 3) {
                        if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeawVar.y();
                        }
                        aeax aeaxVar18 = (aeax) aeawVar.b;
                        aeaxVar18.h = 3;
                        aeaxVar18.b |= 64;
                    } else if (i6 != 4) {
                        if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeawVar.y();
                        }
                        aeax aeaxVar19 = (aeax) aeawVar.b;
                        aeaxVar19.h = 0;
                        aeaxVar19.b |= 64;
                    } else {
                        if ((aeawVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeawVar.y();
                        }
                        aeax aeaxVar20 = (aeax) aeawVar.b;
                        aeaxVar20.h = 4;
                        aeaxVar20.b |= 64;
                    }
                }
                yyfVar.g((aeax) aeawVar.v());
            }
            this.j = yyfVar.f();
        }
        return this.j;
    }

    @Override // defpackage.hkk
    public final List u() {
        return this.f.r;
    }

    @Override // defpackage.hkk
    public final List v() {
        if (F()) {
            return this.e.h;
        }
        return null;
    }

    @Override // defpackage.hkk
    public final boolean w() {
        return this.n;
    }

    @Override // defpackage.hkk
    public final boolean x() {
        return (this.f.b & 32) != 0;
    }

    @Override // defpackage.hkk
    public final boolean y() {
        return !this.f.r.isEmpty();
    }

    @Override // defpackage.hkk
    public final boolean z() {
        return (this.f.b & 524288) != 0;
    }
}
