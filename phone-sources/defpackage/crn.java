package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import j$.util.Objects;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crn {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0182, code lost:
    
        if (r12.size() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0184, code lost:
    
        r0 = new defpackage.dhk((java.util.List) r12, (java.util.List) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018f, code lost:
    
        if (r18 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0191, code lost:
    
        r0 = new defpackage.dhk(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        r0 = new defpackage.dhk(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019d, code lost:
    
        if (r13 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
    
        if (r13 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        r14 = r23;
        r13 = new android.graphics.LinearGradient(r14, r15, r16, r17, (int[]) r0.b, (float[]) r0.a, defpackage.crl.g(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r5, (int[]) r0.b, (float[]) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cc, code lost:
    
        if (r21 <= 0.0f) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ce, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r5, r21, (int[]) r0.b, (float[]) r0.a, defpackage.crl.g(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e9, code lost:
    
        r1 = new defpackage.nuh(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nuh A(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crn.A(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):nuh");
    }

    private static void B(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new css(c, fArr));
    }

    static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.setCategory("call");
    }

    public static int b(Context context, String str) {
        int iU;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iU = cqv.v(appOpsManager, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iU == 0) {
                iU = cqv.v(appOpsManager, strPermissionToOp, iMyUid, context.getOpPackageName());
            }
        } else {
            iU = cqv.u(context, strPermissionToOp, packageName);
        }
        return iU != 0 ? -2 : 0;
    }

    public static Path c(String str) {
        Path path = new Path();
        try {
            d(e(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(css[] cssVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        css cssVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        css cssVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        css[] cssVarArr2 = cssVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = cssVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            css cssVar3 = cssVarArr2[i6];
            char c3 = cssVar3.a;
            float[] fArr3 = cssVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
            switch (c3) {
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    i = 7;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                    i = 6;
                    break;
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                    i = 1;
                    break;
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                case 'l':
                case 'm':
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                default:
                    i = 2;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    i = 4;
                    break;
                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    cssVar = cssVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    css.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != 0.0f ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cssVar = cssVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    cssVar = cssVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cssVar = cssVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    cssVar = cssVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    cssVar = cssVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        cssVar = cssVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    cssVar = cssVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                cssVar = cssVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            cssVar = cssVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(0.0f, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    cssVar = cssVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        cssVar2 = cssVar3;
                        z2 = 1;
                    } else {
                        cssVar2 = cssVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != 0.0f) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    cssVar = cssVar2;
                    css.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                cssVar3 = cssVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = cssVar3.a;
            i6++;
            cssVarArr2 = cssVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:32:0x0084->B:51:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.css[] e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crn.e(java.lang.String):css[]");
    }

    public static css[] f(css[] cssVarArr) {
        css[] cssVarArr2 = new css[cssVarArr.length];
        for (int i = 0; i < cssVarArr.length; i++) {
            cssVarArr2[i] = new css(cssVarArr[i]);
        }
        return cssVarArr2;
    }

    public static float[] g(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static float h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !p(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int i(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !p(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int k(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence m(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String n(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean o(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] q(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int r(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
    }

    public static boolean s(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !p(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static int t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (p(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static ColorStateList u(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!p(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = csh.a;
        try {
            return csh.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static final void v(String str, djo djoVar, djh djhVar, boolean z, dit ditVar, int i, bao baoVar, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 6;
        bao baoVarD = baoVar.d(507525656);
        int i6 = 1;
        if (i5 == 0) {
            i3 = (true != baoVarD.F(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i7 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? baoVarD.F(djoVar) : baoVarD.H(djoVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(djhVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        cmk cmkVar = null;
        byte b = 0;
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.F(null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != ((262144 & i2) == 0 ? baoVarD.F(ditVar) : baoVarD.H(ditVar)) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i3 |= true != baoVarD.D(i4) ? 524288 : 1048576;
        } else {
            i4 = i;
        }
        if ((i3 & 599187) == 599186 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            djh djhVarZ = z(z ? cry.k(djhVar, djoVar) : djhVar, ditVar.a);
            due dueVar = new due(ditVar.b, cmkVar, b == true ? 1 : 0, R.styleable.AppCompatTheme_windowNoTitle);
            baoVarD.y(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = div.a;
                basVar.ae(objT);
            }
            basVar.aa();
            yjk yjkVar = (yjk) ((ymj) objT);
            baoVarD.y(-1115894518);
            baoVarD.y(1886828752);
            if (!(basVar.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(new dji(yjkVar, 0));
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, str, new xb(i7));
            beb.a(baoVarD, djhVarZ, new xb(17));
            beb.a(baoVarD, dueVar, new xb(18));
            beb.a(baoVarD, ditVar, new xb(19));
            beb.a(baoVarD, Boolean.valueOf(z), new xb(20));
            diw diwVar = new diw(i6);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, diwVar);
            }
            baoVarD.o();
            basVar.aa();
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new diu(str, djoVar, djhVar, z, ditVar, i4, i2, 1);
        }
    }

    public static final void w(String str, djo djoVar, djh djhVar, boolean z, dit ditVar, int i, bao baoVar, int i2) {
        int i3;
        boolean z2;
        djh djhVar2;
        dit ditVarY;
        int i4;
        int i5;
        bao baoVar2;
        int i6;
        dit ditVar2;
        boolean z3;
        djh djhVar3;
        bao baoVarD = baoVar.d(81945084);
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? baoVarD.F(djoVar) : baoVarD.H(djoVar)) ? 16 : 32;
        }
        int i7 = i3 | 28032;
        if ((i2 & 196608) == 0) {
            i7 = i3 | 93568;
        }
        int i8 = 1572864 | i7;
        if ((599187 & i8) == 599186 && baoVarD.K()) {
            baoVarD.t();
            djhVar3 = djhVar;
            z3 = z;
            ditVar2 = ditVar;
            baoVar2 = baoVarD;
            i6 = i;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                z2 = true;
                djhVar2 = djh.b;
                ditVarY = y(baoVarD);
                i4 = Integer.MAX_VALUE;
                i5 = i8;
            } else {
                baoVarD.t();
                djhVar2 = djhVar;
                ditVarY = ditVar;
                i4 = i;
                i5 = i8;
                z2 = z;
            }
            baoVarD.m();
            v(str, djoVar, djhVar2, z2, ditVarY, i4, baoVarD, i5 & 3735550);
            baoVar2 = baoVarD;
            i6 = i4;
            ditVar2 = ditVarY;
            z3 = z2;
            djhVar3 = djhVar2;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new diu(str, djoVar, djhVar3, z3, ditVar2, i6, i2, 0);
        }
    }

    public static final void x(String str, yjk yjkVar, djh djhVar, boolean z, dit ditVar, int i, bao baoVar, int i2) {
        int i3;
        dit ditVarY;
        int i4;
        boolean z2;
        djh djhVar2;
        djh djhVar3;
        boolean z3;
        dit ditVar2;
        int i5;
        bao baoVarD = baoVar.d(-650085672);
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i2 & 196608) == 0) {
            i6 = i3 | 93568;
        }
        int i7 = 1572864 | i6;
        if ((599187 & i7) == 599186 && baoVarD.K()) {
            baoVarD.t();
            djhVar3 = djhVar;
            z3 = z;
            ditVar2 = ditVar;
            i5 = i;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                djf djfVar = djh.b;
                ditVarY = y(baoVarD);
                i4 = Integer.MAX_VALUE;
                z2 = true;
                djhVar2 = djfVar;
            } else {
                baoVarD.t();
                djhVar2 = djhVar;
                z2 = z;
                ditVarY = ditVar;
                i4 = i;
            }
            baoVarD.m();
            baoVarD.y(-242680581);
            baoVarD.y(-1287793275);
            String strValueOf = String.valueOf(zy.o(baoVarD));
            bas basVar = (bas) baoVarD;
            basVar.aa();
            djt djtVar = new djt(strValueOf, yjkVar);
            basVar.aa();
            v(str, djtVar, djhVar2, z2, ditVarY, i4, baoVarD, i7 & 3735438);
            djhVar3 = djhVar2;
            z3 = z2;
            ditVar2 = ditVarY;
            i5 = i4;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new diu(str, yjkVar, djhVar3, z3, ditVar2, i5, i2, 2);
        }
    }

    public static final dit y(bao baoVar) {
        baoVar.y(207135993);
        dit ditVar = new dit(crp.e(baoVar).a, crp.e(baoVar).b);
        ((bas) baoVar).aa();
        return ditVar;
    }

    public static final djh z(djh djhVar, duf dufVar) {
        return djhVar.a(new dip(dufVar));
    }
}
