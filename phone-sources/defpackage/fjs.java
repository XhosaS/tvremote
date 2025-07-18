package defpackage;

import android.support.v7.appcompat.R;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjs extends fjv {
    private final edi a = new edi();
    private final edh d = new edh();
    private int e = -1;
    private final int f;
    private final fjq[] g;
    private fjq h;
    private List i;
    private List j;
    private fjr k;
    private int l;

    public fjs(int i, List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = eco.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new fjq[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.g[i2] = new fjq();
        }
        this.h = this.g[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List l() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjs.l():java.util.List");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0121. Please report as an issue. */
    private final void m() {
        int i;
        char c;
        char c2;
        boolean z;
        int i2;
        fjr fjrVar = this.k;
        if (fjrVar != null) {
            int i3 = fjrVar.b;
            int i4 = fjrVar.d;
            int i5 = (i3 + i3) - 1;
            if (i4 != i5) {
                edb.g("DtvCcPacket ended prematurely; size is " + i5 + ", but current index is " + i4 + " (sequence number " + fjrVar.a + ");");
            }
            edh edhVar = this.d;
            fjr fjrVar2 = this.k;
            edhVar.k(fjrVar2.c, fjrVar2.d);
            boolean z2 = false;
            while (true) {
                if (edhVar.a() > 0) {
                    int i6 = 3;
                    int iD = edhVar.d(3);
                    int iD2 = edhVar.d(5);
                    int i7 = 2;
                    if (iD == 7) {
                        edhVar.n(2);
                        iD = edhVar.d(6);
                        if (iD < 7) {
                            edb.e("Cea708Decoder", a.cf(iD, "Invalid extended service number: "));
                        }
                    }
                    if (iD2 == 0) {
                        if (iD != 0) {
                            edb.e("Cea708Decoder", a.cd(iD, "serviceNumber is non-zero (", ") when blockSize is 0"));
                        }
                    } else if (iD != this.f) {
                        edhVar.o(iD2);
                    } else {
                        int iC = edhVar.c() + (iD2 * 8);
                        while (edhVar.c() < iC) {
                            int iD3 = edhVar.d(8);
                            if (iD3 != 16) {
                                if (iD3 <= 31) {
                                    if (iD3 != 0) {
                                        if (iD3 == i6) {
                                            this.i = l();
                                        } else if (iD3 != 8) {
                                            switch (iD3) {
                                                case 12:
                                                    n();
                                                    break;
                                                case 13:
                                                    this.h.c('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (iD3 < 17 || iD3 > 23) {
                                                        if (iD3 >= 24) {
                                                            edb.e("Cea708Decoder", a.cf(iD3, "Currently unsupported COMMAND_P16 Command: "));
                                                            edhVar.n(16);
                                                            break;
                                                        } else {
                                                            edb.e("Cea708Decoder", a.cf(iD3, "Invalid C0 command: "));
                                                            break;
                                                        }
                                                    } else {
                                                        edb.e("Cea708Decoder", a.cf(iD3, "Currently unsupported COMMAND_EXT1 Command: "));
                                                        edhVar.n(8);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.h.l;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    }
                                    i = i7;
                                } else {
                                    if (iD3 > 127) {
                                        if (iD3 <= 159) {
                                            switch (iD3) {
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                    z = true;
                                                    int i8 = iD3 - 128;
                                                    if (this.l != i8) {
                                                        this.l = i8;
                                                        this.h = this.g[i8];
                                                        break;
                                                    }
                                                    break;
                                                case 136:
                                                    z = true;
                                                    for (int i9 = 1; i9 <= 8; i9++) {
                                                        if (edhVar.p()) {
                                                            this.g[8 - i9].d();
                                                        }
                                                    }
                                                    break;
                                                case 137:
                                                    for (int i10 = 1; i10 <= 8; i10++) {
                                                        if (edhVar.p()) {
                                                            this.g[8 - i10].n = true;
                                                        }
                                                    }
                                                    z = true;
                                                    break;
                                                case 138:
                                                    for (int i11 = 1; i11 <= 8; i11++) {
                                                        if (edhVar.p()) {
                                                            this.g[8 - i11].n = false;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 139:
                                                    for (int i12 = 1; i12 <= 8; i12++) {
                                                        if (edhVar.p()) {
                                                            this.g[8 - i12].n = !r3.n;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 140:
                                                    for (int i13 = 1; i13 <= 8; i13++) {
                                                        if (edhVar.p()) {
                                                            this.g[8 - i13].e();
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 141:
                                                    edhVar.n(8);
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 142:
                                                    break;
                                                case 143:
                                                    n();
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 144:
                                                    i2 = i7;
                                                    if (this.h.m) {
                                                        edhVar.d(4);
                                                        edhVar.d(i2);
                                                        edhVar.d(i2);
                                                        boolean zP = edhVar.p();
                                                        boolean zP2 = edhVar.p();
                                                        i6 = 3;
                                                        edhVar.d(3);
                                                        edhVar.d(3);
                                                        this.h.g(zP, zP2);
                                                        z2 = true;
                                                        i7 = 2;
                                                        break;
                                                    } else {
                                                        edhVar.n(16);
                                                        i7 = i2;
                                                        z2 = true;
                                                        i6 = 3;
                                                        break;
                                                    }
                                                case 145:
                                                    if (this.h.m) {
                                                        i2 = 2;
                                                        int iA = fjq.a(edhVar.d(2), edhVar.d(2), edhVar.d(2), edhVar.d(2));
                                                        int iA2 = fjq.a(edhVar.d(2), edhVar.d(2), edhVar.d(2), edhVar.d(2));
                                                        edhVar.n(2);
                                                        fjq.j(edhVar.d(2), edhVar.d(2), edhVar.d(2));
                                                        this.h.h(iA, iA2);
                                                        i7 = i2;
                                                        z2 = true;
                                                        i6 = 3;
                                                        break;
                                                    } else {
                                                        edhVar.n(24);
                                                        z2 = true;
                                                        i6 = 3;
                                                        i7 = 2;
                                                        break;
                                                    }
                                                case 146:
                                                    if (this.h.m) {
                                                        edhVar.n(4);
                                                        int iD4 = edhVar.d(4);
                                                        edhVar.n(2);
                                                        edhVar.d(6);
                                                        fjq fjqVar = this.h;
                                                        if (fjqVar.y != iD4) {
                                                            fjqVar.c('\n');
                                                        }
                                                        fjqVar.y = iD4;
                                                    } else {
                                                        edhVar.n(16);
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                                case 147:
                                                case 148:
                                                case 149:
                                                case 150:
                                                default:
                                                    z = true;
                                                    edb.e("Cea708Decoder", a.cf(iD3, "Invalid C1 command: "));
                                                    break;
                                                case 151:
                                                    if (this.h.m) {
                                                        int iA3 = fjq.a(edhVar.d(2), edhVar.d(2), edhVar.d(2), edhVar.d(2));
                                                        edhVar.d(2);
                                                        fjq.j(edhVar.d(2), edhVar.d(2), edhVar.d(2));
                                                        edhVar.p();
                                                        edhVar.p();
                                                        edhVar.d(2);
                                                        edhVar.d(2);
                                                        int iD5 = edhVar.d(2);
                                                        edhVar.n(8);
                                                        this.h.i(iA3, iD5);
                                                    } else {
                                                        edhVar.n(32);
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                                case 152:
                                                case 153:
                                                case 154:
                                                case 155:
                                                case 156:
                                                case 157:
                                                case 158:
                                                case 159:
                                                    int i14 = iD3 - 152;
                                                    fjq[] fjqVarArr = this.g;
                                                    fjq fjqVar2 = fjqVarArr[i14];
                                                    edhVar.n(i7);
                                                    boolean zP3 = edhVar.p();
                                                    edhVar.n(i7);
                                                    int iD6 = edhVar.d(i6);
                                                    boolean zP4 = edhVar.p();
                                                    int iD7 = edhVar.d(7);
                                                    int iD8 = edhVar.d(8);
                                                    int iD9 = edhVar.d(4);
                                                    int iD10 = edhVar.d(4);
                                                    edhVar.n(i7);
                                                    edhVar.n(6);
                                                    edhVar.n(i7);
                                                    int iD11 = edhVar.d(3);
                                                    int iD12 = edhVar.d(3);
                                                    fjqVar2.m = true;
                                                    fjqVar2.n = zP3;
                                                    fjqVar2.o = iD6;
                                                    fjqVar2.p = zP4;
                                                    fjqVar2.q = iD7;
                                                    fjqVar2.r = iD8;
                                                    fjqVar2.s = iD9;
                                                    int i15 = iD10 + 1;
                                                    if (fjqVar2.t != i15) {
                                                        fjqVar2.t = i15;
                                                        while (true) {
                                                            List list = fjqVar2.k;
                                                            if (list.size() >= fjqVar2.t || list.size() >= 15) {
                                                                list.remove(0);
                                                            }
                                                        }
                                                    }
                                                    if (iD11 != 0 && fjqVar2.v != iD11) {
                                                        fjqVar2.v = iD11;
                                                        int i16 = iD11 - 1;
                                                        int i17 = fjq.g[i16];
                                                        boolean z3 = fjq.f[i16];
                                                        int i18 = fjq.d[i16];
                                                        int i19 = fjq.e[i16];
                                                        fjqVar2.i(i17, fjq.c[i16]);
                                                    }
                                                    if (iD12 != 0 && fjqVar2.w != iD12) {
                                                        fjqVar2.w = iD12;
                                                        int i20 = iD12 - 1;
                                                        int i21 = fjq.i[i20];
                                                        int i22 = fjq.h[i20];
                                                        fjqVar2.g(false, false);
                                                        fjqVar2.h(fjq.a, fjq.j[i20]);
                                                    }
                                                    if (this.l != i14) {
                                                        this.l = i14;
                                                        this.h = fjqVarArr[i14];
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                            }
                                        } else {
                                            z = true;
                                            if (iD3 <= 255) {
                                                this.h.c((char) (iD3 & 255));
                                            } else {
                                                edb.e("Cea708Decoder", a.cf(iD3, "Invalid base command: "));
                                                i = 2;
                                            }
                                        }
                                        z2 = z;
                                        i7 = 2;
                                    } else if (iD3 == 127) {
                                        this.h.c((char) 9835);
                                    } else {
                                        this.h.c((char) (iD3 & 255));
                                    }
                                    z2 = true;
                                }
                                c = 6;
                                c2 = 7;
                                i7 = i;
                            } else {
                                int iD13 = edhVar.d(8);
                                if (iD13 <= 31) {
                                    c2 = 7;
                                    if (iD13 > 7) {
                                        if (iD13 <= 15) {
                                            edhVar.n(8);
                                        } else if (iD13 <= 23) {
                                            edhVar.n(16);
                                        } else {
                                            edhVar.n(24);
                                        }
                                    }
                                } else {
                                    c2 = 7;
                                    if (iD13 <= 127) {
                                        if (iD13 == 32) {
                                            this.h.c(' ');
                                        } else if (iD13 == 33) {
                                            this.h.c((char) 160);
                                        } else if (iD13 == 37) {
                                            this.h.c((char) 8230);
                                        } else if (iD13 == 42) {
                                            this.h.c((char) 352);
                                        } else if (iD13 == 44) {
                                            this.h.c((char) 338);
                                        } else if (iD13 == 63) {
                                            this.h.c((char) 376);
                                        } else if (iD13 == 57) {
                                            this.h.c((char) 8482);
                                        } else if (iD13 == 58) {
                                            this.h.c((char) 353);
                                        } else if (iD13 == 60) {
                                            this.h.c((char) 339);
                                        } else if (iD13 != 61) {
                                            switch (iD13) {
                                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                                    this.h.c((char) 9608);
                                                    break;
                                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                    this.h.c((char) 8216);
                                                    break;
                                                case 50:
                                                    this.h.c((char) 8217);
                                                    break;
                                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                    this.h.c((char) 8220);
                                                    break;
                                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                    this.h.c((char) 8221);
                                                    break;
                                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                    this.h.c((char) 8226);
                                                    break;
                                                default:
                                                    switch (iD13) {
                                                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                            this.h.c((char) 8539);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                            this.h.c((char) 8540);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                            this.h.c((char) 8541);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                            this.h.c((char) 8542);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                            this.h.c((char) 9474);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                            this.h.c((char) 9488);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                            this.h.c((char) 9492);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                            this.h.c((char) 9472);
                                                            break;
                                                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                            this.h.c((char) 9496);
                                                            break;
                                                        case 127:
                                                            this.h.c((char) 9484);
                                                            break;
                                                        default:
                                                            edb.e("Cea708Decoder", a.cf(iD13, "Invalid G2 character: "));
                                                            break;
                                                    }
                                            }
                                        } else {
                                            this.h.c((char) 8480);
                                        }
                                        z2 = true;
                                        i7 = 2;
                                    } else {
                                        if (iD13 > 159) {
                                            i = 2;
                                            c = 6;
                                            if (iD13 <= 255) {
                                                if (iD13 == 160) {
                                                    this.h.c((char) 13252);
                                                } else {
                                                    edb.e("Cea708Decoder", a.cf(iD13, "Invalid G3 character: "));
                                                    this.h.c('_');
                                                }
                                                z2 = true;
                                                i7 = 2;
                                            } else {
                                                edb.e("Cea708Decoder", a.cf(iD13, "Invalid extended command: "));
                                            }
                                        } else if (iD13 <= 135) {
                                            edhVar.n(32);
                                        } else if (iD13 <= 143) {
                                            edhVar.n(40);
                                        } else {
                                            i = 2;
                                            edhVar.n(2);
                                            c = 6;
                                            edhVar.n(edhVar.d(6) * 8);
                                        }
                                        i7 = i;
                                    }
                                }
                                i = 2;
                                c = 6;
                                i7 = i;
                            }
                        }
                    }
                }
            }
            if (z2) {
                this.i = l();
            }
            this.k = null;
        }
    }

    private final void n() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.ehh
    public final String c() {
        throw null;
    }

    @Override // defpackage.fjv, defpackage.ehh
    public final void d() {
        super.d();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        n();
        this.k = null;
    }

    @Override // defpackage.fjv
    protected final fix h() {
        List list = this.i;
        this.j = list;
        list.getClass();
        return new fjw(list);
    }

    @Override // defpackage.fjv
    protected final void j(fjc fjcVar) {
        fjr fjrVar;
        ByteBuffer byteBuffer = fjcVar.c;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        edi ediVar = this.a;
        ediVar.I(bArrArray, iLimit);
        while (ediVar.a() >= 3) {
            int iJ = ediVar.j();
            int i = iJ & 3;
            byte bJ = (byte) ediVar.j();
            byte bJ2 = (byte) ediVar.j();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((iJ & 4) == 4) {
                if (i == 3) {
                    m();
                    int i2 = this.e;
                    int i3 = (bJ & 192) >> 6;
                    if (i2 != -1 && i3 != (3 & (i2 + 1))) {
                        n();
                        edb.e("Cea708Decoder", "Sequence number discontinuity. previous=" + this.e + " current=" + i3);
                    }
                    this.e = i3;
                    int i4 = bJ & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    fjrVar = new fjr(i3, i4);
                    this.k = fjrVar;
                    byte[] bArr = fjrVar.c;
                    int i5 = fjrVar.d;
                    fjrVar.d = i5 + 1;
                    bArr[i5] = bJ2;
                } else {
                    a.H(true);
                    fjrVar = this.k;
                    if (fjrVar == null) {
                        edb.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = fjrVar.d;
                        int i7 = i6 + 1;
                        fjrVar.d = i7;
                        byte[] bArr2 = fjrVar.c;
                        bArr2[i6] = bJ;
                        fjrVar.d = i6 + 2;
                        bArr2[i7] = bJ2;
                    }
                }
                int i8 = fjrVar.d;
                int i9 = fjrVar.b;
                if (i8 == (i9 + i9) - 1) {
                    m();
                }
            }
        }
    }

    @Override // defpackage.fjv
    protected final boolean k() {
        return this.i != this.j;
    }

    @Override // defpackage.fjv, defpackage.ehh
    public final /* bridge */ /* synthetic */ void f() {
    }
}
