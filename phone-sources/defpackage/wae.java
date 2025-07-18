package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wae {
    private static volatile xsq a;

    public static void A(ContentProvider contentProvider) {
        ComponentCallbacks2 componentCallbacks2 = (Application) contentProvider.getContext().getApplicationContext();
        if (!(componentCallbacks2 instanceof xce)) {
            throw new RuntimeException(String.format("%s does not implement %s", componentCallbacks2.getClass().getCanonicalName(), xce.class.getCanonicalName()));
        }
        ac(contentProvider, (xce) componentCallbacks2);
    }

    public static void B(BroadcastReceiver broadcastReceiver, Context context) {
        context.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (!(componentCallbacks2 instanceof xce)) {
            throw new RuntimeException(String.format("%s does not implement %s", componentCallbacks2.getClass().getCanonicalName(), xce.class.getCanonicalName()));
        }
        ac(broadcastReceiver, (xce) componentCallbacks2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final xcp C(upo upoVar) {
        return new xcp(upoVar.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final xco D(upo upoVar) {
        return new xco(upoVar.a);
    }

    public static int E(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static int F(int i) {
        if (i == 99) {
            return 100;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static final Object G(onz onzVar, yih yihVar) throws Exception {
        if (onzVar.h()) {
            Exception excD = onzVar.d();
            if (excD != null) {
                throw excD;
            }
            if (((ooe) onzVar).c) {
                throw new CancellationException(a.cj(onzVar, "Task ", " was cancelled normally."));
            }
            return onzVar.e();
        }
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        onzVar.l(hwg.a, new nmn((yoe) yofVar, 9));
        Object objI = yofVar.i();
        yio yioVar = yio.a;
        return objI;
    }

    public static final Object H(yxl yxlVar, Object obj, yjz yjzVar) {
        return I(yxlVar, true, obj, yjzVar);
    }

    public static final Object I(yxl yxlVar, boolean z, Object obj, yjz yjzVar) throws Throwable {
        Object yonVar;
        Object objD;
        try {
            if (yjzVar instanceof yit) {
                ylh.d(yjzVar, 2);
                yonVar = yjzVar.a(obj, yxlVar);
            } else {
                yonVar = wcq.Q(yjzVar, obj, yxlVar);
            }
        } catch (ypg e) {
            Throwable th = e.a;
            yxlVar.S(new yon(th));
            yih yihVar = yxlVar.e;
            if (yoy.b && (yihVar instanceof yiw)) {
                throw yxn.a(th, (yiw) yihVar);
            }
            throw th;
        } catch (Throwable th2) {
            yonVar = new yon(th2);
        }
        yio yioVar = yio.a;
        if (yonVar == yioVar || (objD = yxlVar.D(yonVar)) == yqm.b) {
            return yioVar;
        }
        yxlVar.e();
        if (!(objD instanceof yon)) {
            return yqm.b(objD);
        }
        if (!z) {
            Throwable th3 = ((yon) objD).b;
            if ((th3 instanceof yrc) && ((yrc) th3).a == yxlVar) {
                if (!(yonVar instanceof yon)) {
                    return yonVar;
                }
                Throwable th4 = ((yon) yonVar).b;
                yih yihVar2 = yxlVar.e;
                if (yoy.b && (yihVar2 instanceof yiw)) {
                    throw yxn.a(th4, (yiw) yihVar2);
                }
                throw th4;
            }
        }
        Throwable th5 = ((yon) objD).b;
        yih yihVar3 = yxlVar.e;
        if (yoy.b && (yihVar3 instanceof yiw)) {
            throw yxn.a(th5, (yiw) yihVar3);
        }
        throw th5;
    }

    public static final void J(yih yihVar, yih yihVar2) throws Throwable {
        try {
            ywv.a(wcq.S(yihVar), ygi.a);
        } catch (Throwable th) {
            ad(yihVar2, th);
        }
    }

    public static final void K(yjz yjzVar, Object obj, yih yihVar) throws Throwable {
        try {
            ywv.a(wcq.S(wcq.R(yjzVar, obj, yihVar)), ygi.a);
        } catch (Throwable th) {
            ad(yihVar, th);
        }
    }

    public static final int L(String str, int i, int i2, int i3) {
        return (int) M(str, i, i2, i3);
    }

    public static final long M(String str, long j, long j2, long j3) {
        String strA = yxp.a(str);
        if (strA == null) {
            return j;
        }
        Long lV = ylh.v(strA);
        if (lV == null) {
            throw new IllegalStateException(a.ci(strA, str, "System property '", "' has unrecognized value '", "'"));
        }
        long jLongValue = lV.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + "'");
    }

    public static final boolean N(String str, boolean z) {
        String strA = yxp.a(str);
        return strA != null ? Boolean.parseBoolean(strA) : z;
    }

    public static /* synthetic */ int O(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return L(str, i, i5, i3);
    }

    public static final long Q(long j, long j2) {
        return j & (~j2);
    }

    public static final long R(long j, int i) {
        return Q(j, 1073741823L) | i;
    }

    public static final void S(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.cf(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final void T(yil yilVar, Throwable th) {
        Iterator it = ywr.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(yilVar, th);
            } catch (yww unused) {
                return;
            } catch (Throwable th2) {
                ywr.a(yks.j(th, th2));
            }
        }
        try {
            ybn.h(th, new ywt(yilVar));
        } catch (Throwable unused2) {
        }
        ywr.a(th);
    }

    public static final Object U(uhp uhpVar, yih yihVar) throws Throwable {
        try {
            if (uhpVar.isDone()) {
                return a.G(uhpVar);
            }
            yof yofVar = new yof(wcq.S(yihVar), 1);
            yofVar.v();
            uhpVar.c(new gqz(uhpVar, (yoe) yofVar, 9), ugk.a);
            yofVar.b(new bil(uhpVar, 12));
            return yofVar.i();
        } catch (ExecutionException e) {
            throw V(e);
        }
    }

    public static final Throwable V(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static /* synthetic */ uhp W(yow yowVar, yjz yjzVar) {
        boolean zJ = yoz.j(1);
        yim yimVar = yim.a;
        if (zJ) {
            "DEFAULT".toString();
            throw new IllegalArgumentException("DEFAULT start is not supported");
        }
        ywj ywjVar = new ywj(yos.b(yowVar, yimVar));
        yoz.i(1, yjzVar, ywjVar, ywjVar);
        return ywjVar.b;
    }

    public static /* synthetic */ ysx X(yvw yvwVar, yil yilVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            yilVar = yim.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return yvwVar.eT(yilVar, i, i2);
    }

    public static final void Y(yvh yvhVar, Object obj) {
        if (yvhVar.a != obj) {
            throw yvhVar;
        }
    }

    public static final Object Z(ysy ysyVar, ysx[] ysxVarArr, yjk yjkVar, yka ykaVar, yih yihVar) {
        yvt yvtVar = new yvt(ysxVarArr, yjkVar, ykaVar, ysyVar, null);
        yvv yvvVar = new yvv(yihVar.getContext(), yihVar);
        Object objH = H(yvvVar, yvvVar, yvtVar);
        yio yioVar = yio.a;
        if (objH == yioVar) {
            yihVar.getClass();
        }
        return objH == yioVar ? objH : ygi.a;
    }

    public static xsq a() {
        xsq xsqVarA;
        xsq xsqVar = a;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (wae.class) {
            xsqVarA = a;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.metadata.MetadataService", "FetchAsset");
                xsnVarA.b();
                vzt vztVar = vzt.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(vztVar);
                xsnVarA.c = new yep(vzu.a);
                xsqVarA = xsnVarA.a();
                a = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static final Object aa(yil yilVar, Object obj, Object obj2, yjz yjzVar, yih yihVar) {
        Object objA;
        Object objB = yxr.b(yilVar, obj2);
        try {
            ywe yweVar = new ywe(yihVar, yilVar);
            if (yjzVar instanceof yit) {
                ylh.d(yjzVar, 2);
                objA = yjzVar.a(obj, yweVar);
            } else {
                objA = wcq.Q(yjzVar, obj, yweVar);
            }
            yxr.c(yilVar, objB);
            if (objA == yio.a) {
                yihVar.getClass();
            }
            return objA;
        } catch (Throwable th) {
            yxr.c(yilVar, objB);
            throw th;
        }
    }

    public static /* synthetic */ int ab(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private static void ac(Object obj, xce xceVar) {
        xby<Object> xbyVarAndroidInjector = xceVar.androidInjector();
        xceVar.getClass();
        xbyVarAndroidInjector.getClass();
        xbyVarAndroidInjector.a(obj);
    }

    private static final void ad(yih yihVar, Throwable th) throws Throwable {
        if (th instanceof ypg) {
            th = ((ypg) th).a;
        }
        yihVar.resumeWith(ybn.e(th));
        throw th;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            default:
                return 0;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static int d(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 31;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 32;
            case 32:
                return 33;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 34;
            case 34:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 36;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 37;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 38;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 39;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 40;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 41;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 43;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 44;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 45;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 46;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 47;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 48;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 49;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 50;
            case 50:
                return 51;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 52;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 53;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 54;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return 55;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return 56;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return 57;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return 58;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return 59;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return 60;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return 61;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return 62;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return 63;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return 64;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return 65;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return 66;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return 67;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return 68;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return 69;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return 70;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return 71;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return 72;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return 73;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return 74;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return 75;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return 76;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return 77;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return 78;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return 79;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return 80;
            default:
                switch (i) {
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        return 97;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        return 98;
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        return 99;
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItem;
                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItemSmall;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                        return R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        return R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return R.styleable.AppCompatTheme_textColorAlertDialogListItem;
                    case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                        return R.styleable.AppCompatTheme_textColorSearchUrl;
                    case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                        return R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                        return R.styleable.AppCompatTheme_toolbarStyle;
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                        return R.styleable.AppCompatTheme_tooltipForegroundColor;
                    case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                        return R.styleable.AppCompatTheme_tooltipFrameBackground;
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        return R.styleable.AppCompatTheme_viewInflaterClass;
                    case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                        return R.styleable.AppCompatTheme_windowActionBar;
                    case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                        return R.styleable.AppCompatTheme_windowActionBarOverlay;
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        return R.styleable.AppCompatTheme_windowActionModeOverlay;
                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                        return R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                        return R.styleable.AppCompatTheme_windowFixedHeightMinor;
                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                        return R.styleable.AppCompatTheme_windowFixedWidthMajor;
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        return R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                        return R.styleable.AppCompatTheme_windowMinWidthMajor;
                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return R.styleable.AppCompatTheme_windowMinWidthMinor;
                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return R.styleable.AppCompatTheme_windowNoTitle;
                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return 127;
                    case 127:
                        return 128;
                    case 128:
                        return 129;
                    case 129:
                        return 130;
                    case 130:
                        return 131;
                    case 131:
                        return 132;
                    case 132:
                        return 133;
                    case 133:
                        return 134;
                    case 134:
                        return 135;
                    case 135:
                        return 136;
                    case 136:
                        return 137;
                    case 137:
                        return 138;
                    case 138:
                        return 139;
                    case 139:
                        return 140;
                    case 140:
                        return 141;
                    case 141:
                        return 142;
                    case 142:
                        return 143;
                    case 143:
                        return 144;
                    case 144:
                        return 145;
                    case 145:
                        return 146;
                    case 146:
                        return 147;
                    case 147:
                        return 148;
                    case 148:
                        return 149;
                    case 149:
                        return 150;
                    default:
                        return 0;
                }
        }
    }

    public static final /* synthetic */ wlf e(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wlf) vucVarO;
    }

    public static final void f(wkx wkxVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wlf wlfVar = (wlf) vtwVar.b;
        wlf wlfVar2 = wlf.a;
        wlfVar.d = wkxVar;
        wlfVar.c = 3;
    }

    public static final void g(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wlf wlfVar = (wlf) vtwVar.b;
        wlf wlfVar2 = wlf.a;
        wlfVar.f = str;
    }

    public static final void h(woq woqVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wlf wlfVar = (wlf) vtwVar.b;
        wlf wlfVar2 = wlf.a;
        wlfVar.d = woqVar;
        wlfVar.c = 4;
    }

    public static final void i(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wlf wlfVar = (wlf) vtwVar.b;
        wlf wlfVar2 = wlf.a;
        wlfVar.g = i - 2;
    }

    public static final /* synthetic */ wkx j(vty vtyVar) {
        vuc vucVarO = vtyVar.r();
        vucVarO.getClass();
        return (wkx) vucVarO;
    }

    public static final void k(String str, vty vtyVar) {
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wkx wkxVar = (wkx) vtyVar.b;
        wkx wkxVar2 = wkx.a;
        wkxVar.b |= 1;
        wkxVar.c = str;
    }

    public static final void l(wkw wkwVar, vty vtyVar) {
        wkwVar.getClass();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wkx wkxVar = (wkx) vtyVar.b;
        wkx wkxVar2 = wkx.a;
        wkxVar.d = wkwVar.az;
        wkxVar.b |= 2;
    }

    public static final /* synthetic */ wkg m(vty vtyVar) {
        vuc vucVarO = vtyVar.r();
        vucVarO.getClass();
        return (wkg) vucVarO;
    }

    public static final void n(wkf wkfVar, vty vtyVar) {
        wkfVar.getClass();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wkg wkgVar = (wkg) vtyVar.b;
        wkg wkgVar2 = wkg.a;
        wkgVar.c = wkfVar.u;
        wkgVar.b |= 1;
    }

    public static final /* synthetic */ wjn o(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wjn) vucVarO;
    }

    public static final /* synthetic */ void p(Iterable iterable, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wjn wjnVar = (wjn) vtwVar.b;
        wjn wjnVar2 = wjn.a;
        vun vunVar = wjnVar.b;
        if (!vunVar.c()) {
            wjnVar.b = vuc.s(vunVar);
        }
        vsf.h(iterable, wjnVar.b);
    }

    public static final /* synthetic */ Object r(vvd vvdVar, vty vtyVar) {
        Object objBI = vtyVar.bI(vvdVar);
        objBI.getClass();
        return objBI;
    }

    public static final void s(xcq xcqVar, List list) {
        list.add(xcqVar);
    }

    public static final void t(xcq xcqVar, List list) {
        list.add(xcqVar);
    }

    public static int u(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static LinkedHashMap v(int i) {
        return new LinkedHashMap(u(i));
    }

    public static List w(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(bv bvVar) {
        xce xceVar;
        bv parentFragment = bvVar;
        while (true) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                by activity = bvVar.getActivity();
                if (activity instanceof xce) {
                    xceVar = (xce) activity;
                } else {
                    if (!(activity.getApplication() instanceof xce)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", bvVar.getClass().getCanonicalName()));
                    }
                    xceVar = (xce) activity.getApplication();
                }
            } else if (parentFragment instanceof xce) {
                xceVar = (xce) parentFragment;
                break;
            }
        }
        xby<Object> xbyVarAndroidInjector = xceVar.androidInjector();
        xceVar.getClass();
        xbyVarAndroidInjector.getClass();
        xbyVarAndroidInjector.a(bvVar);
    }

    public static void y(Activity activity) {
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof xce)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), xce.class.getCanonicalName()));
        }
        ac(activity, (xce) application);
    }

    public static void z(Service service) {
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof xce)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), xce.class.getCanonicalName()));
        }
        ac(service, (xce) application);
    }
}
