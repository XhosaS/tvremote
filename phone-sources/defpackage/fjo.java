package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.helper.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjo extends fjv {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private final long o;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_textAppearanceListItem, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 108, 109, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final edi k = new edi();
    private final ArrayList p = new ArrayList();
    private fjn q = new fjn(0, 4);
    private int z = 0;

    public fjo(String str, int i2) {
        a.H(true);
        this.o = 16000000L;
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else {
                    if (i2 != 4) {
                        edb.e("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.n = 0;
                        this.m = 0;
                        o(0);
                        n();
                        this.A = true;
                        this.B = -9223372036854775807L;
                    }
                    this.n = 1;
                }
                this.m = 1;
                o(0);
                n();
                this.A = true;
                this.B = -9223372036854775807L;
            }
            this.n = 1;
        }
        this.m = 0;
        o(0);
        n();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char l(byte b) {
        return (char) f[b - 32];
    }

    private final List m() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            eca ecaVarB = ((fjn) arrayList.get(i2)).b(Integer.MIN_VALUE);
            arrayList2.add(ecaVarB);
            if (ecaVarB != null) {
                iMin = Math.min(iMin, ecaVarB.C);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            eca ecaVarB2 = (eca) arrayList2.get(i3);
            if (ecaVarB2 != null) {
                if (ecaVarB2.C != iMin) {
                    ecaVarB2 = ((fjn) arrayList.get(i3)).b(iMin);
                    ecaVarB2.getClass();
                }
                arrayList3.add(ecaVarB2);
            }
        }
        return arrayList3;
    }

    private final void n() {
        this.q.e(this.t);
        ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.add(this.q);
    }

    private final void o(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 != 3) {
            n();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.r = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.p;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((fjn) arrayList.get(i4)).g = 3;
            i4++;
        }
    }

    private final void p(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean q(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.fjv, defpackage.ehh
    public final /* bridge */ /* synthetic */ Object b() {
        return b();
    }

    @Override // defpackage.ehh
    public final String c() {
        throw null;
    }

    @Override // defpackage.fjv, defpackage.ehh
    public final void d() {
        super.d();
        this.r = null;
        this.s = null;
        o(0);
        p(4);
        n();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.fjv
    protected final fix h() {
        List list = this.r;
        this.s = list;
        list.getClass();
        return new fjw(list);
    }

    @Override // defpackage.fjv
    /* renamed from: i */
    public final fjd b() {
        fjd fjdVar;
        fjd fjdVarB = super.b();
        if (fjdVarB != null) {
            return fjdVarB;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (fjdVar = (fjd) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = Collections.EMPTY_LIST;
        this.B = -9223372036854775807L;
        fjdVar.d(this.c, h(), Long.MAX_VALUE);
        return fjdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104 A[PHI: r13
  0x0104: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:72:0x00e2, B:80:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    @Override // defpackage.fjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void j(defpackage.fjc r17) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjo.j(fjc):void");
    }

    @Override // defpackage.fjv
    protected final boolean k() {
        return this.r != this.s;
    }

    @Override // defpackage.fjv, defpackage.ehh
    public final void f() {
    }
}
