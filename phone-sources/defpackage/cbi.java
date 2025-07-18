package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbi extends cuo {
    public static final ja a;
    public final je A;
    public final iy B;
    public final iy C;
    public final jc D;
    public final iy E;
    public final cvi F;
    public dhk G;
    private final long I;
    private final cbf J;
    private final it K;
    private final yrz L;
    private jc M;
    private final yjv N;
    public final cbc b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public int j;
    public cyq k;
    public cyq l;
    public boolean m;
    public final kp n;
    public final kp o;
    public int p;
    public Integer q;
    public boolean r;
    public cbg s;
    public final String t;
    public final String u;
    public boolean v;
    public final Runnable w;
    public final List x;
    public final jc y;
    public final jc z;
    public int c = Integer.MIN_VALUE;
    private final yjv H = new brj(this, 18);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        ja jaVar = jb.a;
        ja jaVar2 = new ja(32);
        int i = jaVar2.b;
        if (i < 0) {
            kv.c("");
        }
        jaVar2.c(jaVar2.b + 32);
        int[] iArr2 = jaVar2.a;
        int i2 = jaVar2.b;
        if (i != i2) {
            yfm.bh(iArr2, iArr2, i + 32, i, i2);
        }
        yfm.bm(iArr, iArr2, i, 0, 12);
        jaVar2.b += 32;
        a = jaVar2;
    }

    public cbi(cbc cbcVar) {
        this.b = cbcVar;
        Object systemService = cbcVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.I = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: cbd
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                cbi cbiVar = this.a;
                cbiVar.g = z ? cbiVar.d.getEnabledAccessibilityServiceList(-1) : yhb.a;
            }
        };
        this.f = new tch(this, 1);
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.J = new cbf(this);
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.y = new jc((byte[]) null);
        this.z = new jc((byte[]) null);
        this.n = new kp(null);
        this.o = new kp(null);
        this.p = -1;
        this.K = new it((byte[]) null);
        this.L = vyf.R(1, 0, 6);
        this.r = true;
        this.M = jd.a();
        this.A = new je((byte[]) null);
        this.B = new iy((byte[]) null);
        this.C = new iy((byte[]) null);
        this.t = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.u = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new cvi();
        this.D = new jc((byte[]) null);
        this.G = new dhk(cbcVar.U.e(), jd.a());
        int i = iz.a;
        this.E = new iy((byte[]) null);
        cbcVar.addOnAttachStateChangeListener(new bne(this, 2));
        this.w = new Runnable() { // from class: cbe
            /* JADX WARN: Code restructure failed: missing block: B:271:0x0794, code lost:
            
                r24 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:272:0x079e, code lost:
            
                if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L276;
             */
            /* JADX WARN: Code restructure failed: missing block: B:273:0x07a0, code lost:
            
                r8 = -1;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:196:0x04f4  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x06f6  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[Catch: all -> 0x0886, Merged into TryCatch #0 {all -> 0x0890, all -> 0x0881, all -> 0x0886, all -> 0x088b, blocks: (B:5:0x0016, B:9:0x002e, B:228:0x0675, B:309:0x0877, B:313:0x0882, B:314:0x0885, B:316:0x0887, B:317:0x088a, B:319:0x088c, B:320:0x088f, B:229:0x067d, B:232:0x0690, B:234:0x069c, B:236:0x06a7, B:238:0x06ad, B:240:0x06be, B:243:0x06c4, B:245:0x06d0, B:247:0x06dd, B:249:0x06eb, B:250:0x06f0, B:253:0x06f8, B:254:0x06fb, B:257:0x0707, B:259:0x0713, B:261:0x071e, B:263:0x0724, B:264:0x0739, B:267:0x077a, B:275:0x07a3, B:278:0x07be, B:270:0x078b, B:271:0x0794, B:276:0x07a7, B:284:0x07d8, B:285:0x07e2, B:288:0x07f9, B:290:0x0805, B:292:0x0812, B:294:0x0818, B:296:0x0830, B:298:0x0836, B:300:0x0844, B:301:0x0852, B:307:0x0861, B:308:0x0864, B:10:0x0036, B:13:0x005a, B:15:0x0069, B:17:0x0075, B:19:0x007b, B:22:0x008c, B:24:0x0096, B:27:0x009f, B:30:0x00c0, B:32:0x00d0, B:34:0x00db, B:36:0x00e1, B:38:0x00fd, B:46:0x011a, B:51:0x013a, B:53:0x0142, B:55:0x0151, B:201:0x055d, B:58:0x0162, B:60:0x016c, B:63:0x0176, B:65:0x017e, B:66:0x0199, B:68:0x01a4, B:90:0x023a, B:71:0x01b0, B:73:0x01b8, B:75:0x01c6, B:77:0x01e6, B:79:0x01f6, B:81:0x0206, B:84:0x0218, B:86:0x021d, B:87:0x0224, B:88:0x0228, B:91:0x0255, B:93:0x0261, B:95:0x027c, B:98:0x0286, B:100:0x028e, B:103:0x029b, B:106:0x02a3, B:108:0x02bf, B:114:0x02db, B:116:0x02df, B:121:0x02f8, B:135:0x0331, B:137:0x037c, B:140:0x0388, B:136:0x035c, B:119:0x02f3, B:111:0x02ce, B:141:0x03a4, B:143:0x03c1, B:145:0x03d5, B:147:0x03db, B:151:0x03e2, B:152:0x0426, B:154:0x042c, B:157:0x0436, B:159:0x043e, B:161:0x0449, B:162:0x045a, B:163:0x046f, B:165:0x0477, B:167:0x0489, B:169:0x0494, B:171:0x049f, B:173:0x04a5, B:177:0x04b0, B:178:0x04b8, B:179:0x04b9, B:180:0x04c1, B:181:0x04c2, B:184:0x04c9, B:186:0x04cd, B:189:0x04dd, B:192:0x04e2, B:195:0x04ef, B:197:0x04f8, B:198:0x051e, B:40:0x0105, B:44:0x0115, B:43:0x010e, B:207:0x05a0, B:211:0x05d1, B:212:0x05d9, B:214:0x05df, B:216:0x05f9, B:217:0x0609, B:218:0x0613, B:6:0x001b, B:8:0x0021), top: B:327:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[Catch: all -> 0x0886, Merged into TryCatch #0 {all -> 0x0890, all -> 0x0881, all -> 0x0886, all -> 0x088b, blocks: (B:5:0x0016, B:9:0x002e, B:228:0x0675, B:309:0x0877, B:313:0x0882, B:314:0x0885, B:316:0x0887, B:317:0x088a, B:319:0x088c, B:320:0x088f, B:229:0x067d, B:232:0x0690, B:234:0x069c, B:236:0x06a7, B:238:0x06ad, B:240:0x06be, B:243:0x06c4, B:245:0x06d0, B:247:0x06dd, B:249:0x06eb, B:250:0x06f0, B:253:0x06f8, B:254:0x06fb, B:257:0x0707, B:259:0x0713, B:261:0x071e, B:263:0x0724, B:264:0x0739, B:267:0x077a, B:275:0x07a3, B:278:0x07be, B:270:0x078b, B:271:0x0794, B:276:0x07a7, B:284:0x07d8, B:285:0x07e2, B:288:0x07f9, B:290:0x0805, B:292:0x0812, B:294:0x0818, B:296:0x0830, B:298:0x0836, B:300:0x0844, B:301:0x0852, B:307:0x0861, B:308:0x0864, B:10:0x0036, B:13:0x005a, B:15:0x0069, B:17:0x0075, B:19:0x007b, B:22:0x008c, B:24:0x0096, B:27:0x009f, B:30:0x00c0, B:32:0x00d0, B:34:0x00db, B:36:0x00e1, B:38:0x00fd, B:46:0x011a, B:51:0x013a, B:53:0x0142, B:55:0x0151, B:201:0x055d, B:58:0x0162, B:60:0x016c, B:63:0x0176, B:65:0x017e, B:66:0x0199, B:68:0x01a4, B:90:0x023a, B:71:0x01b0, B:73:0x01b8, B:75:0x01c6, B:77:0x01e6, B:79:0x01f6, B:81:0x0206, B:84:0x0218, B:86:0x021d, B:87:0x0224, B:88:0x0228, B:91:0x0255, B:93:0x0261, B:95:0x027c, B:98:0x0286, B:100:0x028e, B:103:0x029b, B:106:0x02a3, B:108:0x02bf, B:114:0x02db, B:116:0x02df, B:121:0x02f8, B:135:0x0331, B:137:0x037c, B:140:0x0388, B:136:0x035c, B:119:0x02f3, B:111:0x02ce, B:141:0x03a4, B:143:0x03c1, B:145:0x03d5, B:147:0x03db, B:151:0x03e2, B:152:0x0426, B:154:0x042c, B:157:0x0436, B:159:0x043e, B:161:0x0449, B:162:0x045a, B:163:0x046f, B:165:0x0477, B:167:0x0489, B:169:0x0494, B:171:0x049f, B:173:0x04a5, B:177:0x04b0, B:178:0x04b8, B:179:0x04b9, B:180:0x04c1, B:181:0x04c2, B:184:0x04c9, B:186:0x04cd, B:189:0x04dd, B:192:0x04e2, B:195:0x04ef, B:197:0x04f8, B:198:0x051e, B:40:0x0105, B:44:0x0115, B:43:0x010e, B:207:0x05a0, B:211:0x05d1, B:212:0x05d9, B:214:0x05df, B:216:0x05f9, B:217:0x0609, B:218:0x0613, B:6:0x001b, B:8:0x0021), top: B:327:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0162 A[Catch: all -> 0x0886, Merged into TryCatch #0 {all -> 0x0890, all -> 0x0881, all -> 0x0886, all -> 0x088b, blocks: (B:5:0x0016, B:9:0x002e, B:228:0x0675, B:309:0x0877, B:313:0x0882, B:314:0x0885, B:316:0x0887, B:317:0x088a, B:319:0x088c, B:320:0x088f, B:229:0x067d, B:232:0x0690, B:234:0x069c, B:236:0x06a7, B:238:0x06ad, B:240:0x06be, B:243:0x06c4, B:245:0x06d0, B:247:0x06dd, B:249:0x06eb, B:250:0x06f0, B:253:0x06f8, B:254:0x06fb, B:257:0x0707, B:259:0x0713, B:261:0x071e, B:263:0x0724, B:264:0x0739, B:267:0x077a, B:275:0x07a3, B:278:0x07be, B:270:0x078b, B:271:0x0794, B:276:0x07a7, B:284:0x07d8, B:285:0x07e2, B:288:0x07f9, B:290:0x0805, B:292:0x0812, B:294:0x0818, B:296:0x0830, B:298:0x0836, B:300:0x0844, B:301:0x0852, B:307:0x0861, B:308:0x0864, B:10:0x0036, B:13:0x005a, B:15:0x0069, B:17:0x0075, B:19:0x007b, B:22:0x008c, B:24:0x0096, B:27:0x009f, B:30:0x00c0, B:32:0x00d0, B:34:0x00db, B:36:0x00e1, B:38:0x00fd, B:46:0x011a, B:51:0x013a, B:53:0x0142, B:55:0x0151, B:201:0x055d, B:58:0x0162, B:60:0x016c, B:63:0x0176, B:65:0x017e, B:66:0x0199, B:68:0x01a4, B:90:0x023a, B:71:0x01b0, B:73:0x01b8, B:75:0x01c6, B:77:0x01e6, B:79:0x01f6, B:81:0x0206, B:84:0x0218, B:86:0x021d, B:87:0x0224, B:88:0x0228, B:91:0x0255, B:93:0x0261, B:95:0x027c, B:98:0x0286, B:100:0x028e, B:103:0x029b, B:106:0x02a3, B:108:0x02bf, B:114:0x02db, B:116:0x02df, B:121:0x02f8, B:135:0x0331, B:137:0x037c, B:140:0x0388, B:136:0x035c, B:119:0x02f3, B:111:0x02ce, B:141:0x03a4, B:143:0x03c1, B:145:0x03d5, B:147:0x03db, B:151:0x03e2, B:152:0x0426, B:154:0x042c, B:157:0x0436, B:159:0x043e, B:161:0x0449, B:162:0x045a, B:163:0x046f, B:165:0x0477, B:167:0x0489, B:169:0x0494, B:171:0x049f, B:173:0x04a5, B:177:0x04b0, B:178:0x04b8, B:179:0x04b9, B:180:0x04c1, B:181:0x04c2, B:184:0x04c9, B:186:0x04cd, B:189:0x04dd, B:192:0x04e2, B:195:0x04ef, B:197:0x04f8, B:198:0x051e, B:40:0x0105, B:44:0x0115, B:43:0x010e, B:207:0x05a0, B:211:0x05d1, B:212:0x05d9, B:214:0x05df, B:216:0x05f9, B:217:0x0609, B:218:0x0613, B:6:0x001b, B:8:0x0021), top: B:327:0x0016 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2202
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cbe.run():void");
            }
        };
        this.x = new ArrayList();
        this.N = new brj(this, 19);
    }

    public static final CharSequence B(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        charSequenceSubSequence.getClass();
        return charSequenceSubSequence;
    }

    public static final String C(cff cffVar) {
        cfy cfyVarZ;
        if (cffVar == null) {
            return null;
        }
        cfc cfcVar = cffVar.c;
        cfm cfmVar = cfi.a;
        if (cfcVar.f(cfmVar)) {
            return cmq.d((List) cfcVar.b(cfmVar), ",", null, null, null, 62);
        }
        if (cfcVar.f(cfi.E)) {
            cfyVarZ = z(cfcVar);
            if (cfyVarZ == null) {
                return null;
            }
        } else {
            List list = (List) ccf.t(cfcVar, cfi.A);
            if (list == null || (cfyVarZ = (cfy) yfm.U(list)) == null) {
                return null;
            }
        }
        return cfyVarZ.b;
    }

    private final boe G(bol bolVar, cff cffVar) {
        return bolVar.a(clw.y(cffVar.b()), cffVar.b.q, this.b.m());
    }

    private static final Rect H(bmy bmyVar) {
        float f = bmyVar.e;
        float f2 = bmyVar.d;
        return new Rect((int) bmyVar.b, (int) bmyVar.c, (int) f2, (int) f);
    }

    private static final float[] I(boe boeVar) {
        if (!(boeVar instanceof bod)) {
            return null;
        }
        bmz bmzVar = ((bod) boeVar).a;
        long j = bmzVar.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = bmzVar.f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = bmzVar.g;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = bmzVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4))};
    }

    private static final Rect J(boe boeVar) {
        if ((boeVar instanceof boc) || (boeVar instanceof bod)) {
            return H(boeVar.a());
        }
        return null;
    }

    private static final Region K(boe boeVar) {
        if (!(boeVar instanceof bob)) {
            return null;
        }
        bob bobVar = (bob) boeVar;
        Region region = new Region(H(bobVar.a()));
        Region region2 = new Region();
        region2.setPath(bobVar.a.a, region);
        return region2;
    }

    public static final float a(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public static final boolean u(cfa cfaVar, float f) {
        if (f >= 0.0f || ((Number) cfaVar.a.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) cfaVar.a.a()).floatValue() < ((Number) cfaVar.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean v(cfa cfaVar) {
        yjk yjkVar = cfaVar.a;
        if (((Number) yjkVar.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) yjkVar.a()).floatValue();
        ((Number) cfaVar.b.a()).floatValue();
        return false;
    }

    public static final boolean w(cfa cfaVar) {
        yjk yjkVar = cfaVar.a;
        if (((Number) yjkVar.a()).floatValue() < ((Number) cfaVar.b.a()).floatValue()) {
            return true;
        }
        ((Number) yjkVar.a()).floatValue();
        return false;
    }

    static /* synthetic */ void y(cbi cbiVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        cbiVar.A(i, i2, num, null);
    }

    public static final cfy z(cfc cfcVar) {
        return (cfy) ccf.t(cfcVar, cfi.E);
    }

    public final void A(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !r()) {
            return;
        }
        AccessibilityEvent accessibilityEventE = e(i, i2);
        if (num != null) {
            accessibilityEventE.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventE.setContentDescription(cmq.d(list, ",", null, null, null, 62));
        }
        D(accessibilityEventE);
    }

    public final void D(AccessibilityEvent accessibilityEvent) {
        if (r()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.m = true;
            }
            try {
                ((Boolean) this.H.a(accessibilityEvent)).booleanValue();
            } finally {
                this.m = false;
            }
        }
    }

    public final Rect E(dhk dhkVar) {
        cmg cmgVar = (cmg) dhkVar.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(cmgVar.b);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(cmgVar.c);
        int i = cmgVar.d;
        cbc cbcVar = this.b;
        long jD = cbcVar.d((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
        long jD2 = cbcVar.d((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(cmgVar.e) & 4294967295L));
        int i2 = (int) (jD2 >> 32);
        int i3 = (int) (jD >> 32);
        int i4 = (int) (jD2 & 4294967295L);
        int i5 = (int) (jD & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))));
    }

    public final void F(cff cffVar, dhk dhkVar) {
        int[] iArr = jf.a;
        je jeVar = new je((byte[]) null);
        List listJ = cffVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cff cffVar2 = (cff) listJ.get(i);
            jc jcVarG = g();
            int i2 = cffVar2.e;
            if (jcVarG.b(i2)) {
                if (!((je) dhkVar.b).a(i2)) {
                    k(cffVar.b);
                    return;
                }
                jeVar.d(i2);
            }
        }
        je jeVar2 = (je) dhkVar.b;
        int[] iArr2 = jeVar2.b;
        long[] jArr = jeVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((255 & j) < 128 && !jeVar.a(iArr2[(i3 << 3) + i5])) {
                            k(cffVar.b);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                } else if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List listJ2 = cffVar.j();
        int size2 = listJ2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            cff cffVar3 = (cff) listJ2.get(i7);
            jc jcVarG2 = g();
            int i8 = cffVar3.e;
            if (jcVarG2.b(i8)) {
                Object objA = this.D.a(i8);
                objA.getClass();
                F(cffVar3, (dhk) objA);
            }
        }
    }

    public final int b(cff cffVar) {
        cfc cfcVar = cffVar.c;
        if (!cfcVar.f(cfi.a)) {
            cfm cfmVar = cfi.F;
            if (cfcVar.f(cfmVar)) {
                return chb.a(((chb) cfcVar.b(cfmVar)).b);
            }
        }
        return this.p;
    }

    public final int c(cff cffVar) {
        cfc cfcVar = cffVar.c;
        if (!cfcVar.f(cfi.a)) {
            cfm cfmVar = cfi.F;
            if (cfcVar.f(cfmVar)) {
                return chb.e(((chb) cfcVar.b(cfmVar)).b);
            }
        }
        return this.p;
    }

    public final int d(int i) {
        if (i == this.b.U.e().e) {
            return -1;
        }
        return i;
    }

    public final AccessibilityEvent e(int i, int i2) {
        dhk dhkVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        cbc cbcVar = this.b;
        accessibilityEventObtain.setPackageName(cbcVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(cbcVar, i);
        if (r() && (dhkVar = (dhk) g().a(i)) != null) {
            cfc cfcVar = ((cff) dhkVar.b).c;
            accessibilityEventObtain.setPassword(cfcVar.f(cfi.J));
            boolean zE = yks.e(ccf.t(cfcVar, cfi.n), true);
            if (Build.VERSION.SDK_INT >= 34) {
                accessibilityEventObtain.setAccessibilityDataSensitive(zE);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent f(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventE = e(i, 8192);
        if (num != null) {
            accessibilityEventE.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventE.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventE.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventE.getText().add(charSequence);
        }
        return accessibilityEventE;
    }

    public final jc g() {
        if (this.r) {
            this.r = false;
            cbc cbcVar = this.b;
            this.M = cfg.c(cbcVar.U);
            if (r()) {
                jc jcVar = this.M;
                iy iyVar = this.B;
                iy iyVar2 = this.C;
                Resources resources = cbcVar.getContext().getResources();
                iyVar.b();
                iyVar2.b();
                dhk dhkVar = (dhk) jcVar.a(-1);
                Object obj = dhkVar != null ? dhkVar.b : null;
                obj.getClass();
                int i = 1;
                List listA = cfo.a((cff) obj, new brj(jcVar, 20), new cbq(resources, 1), yfm.p(obj));
                int iQ = yfm.q(listA);
                if (iQ > 0) {
                    while (true) {
                        int i2 = ((cff) listA.get(i - 1)).e;
                        int i3 = ((cff) listA.get(i)).e;
                        iyVar.c(i2, i3);
                        iyVar2.c(i3, i2);
                        if (i == iQ) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.M;
    }

    @Override // defpackage.cuo
    public final cyt getAccessibilityNodeProvider(View view) {
        return this.J;
    }

    public final cyq h() {
        if (this.d.isEnabled()) {
            return null;
        }
        return cyq.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005b, B:27:0x0063, B:29:0x006c, B:31:0x0074, B:33:0x0080, B:35:0x008e, B:40:0x00a2, B:43:0x00a9, B:45:0x00ad, B:49:0x00b8, B:51:0x00c0, B:38:0x009a, B:52:0x00cd, B:66:0x0145, B:55:0x00d4, B:57:0x00e2, B:60:0x00f8, B:62:0x0100, B:64:0x0122, B:65:0x0142, B:67:0x0149, B:69:0x0151, B:70:0x016f, B:72:0x0176, B:73:0x017f, B:18:0x003a, B:21:0x0041), top: B:82:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x019a -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbi.i(yih):java.lang.Object");
    }

    public final void j(int i, cyq cyqVar, String str, Bundle bundle) {
        Object obj;
        bol bolVar;
        Region regionK;
        float[] fArrI;
        Rect rectJ;
        cgz cgzVar;
        int i2;
        dhk dhkVar = (dhk) g().a(i);
        if (dhkVar == null || (obj = dhkVar.b) == null) {
            return;
        }
        String str2 = this.t;
        cff cffVar = (cff) obj;
        String strC = C(cffVar);
        if (yks.e(str, str2)) {
            int iD = this.B.d(i);
            if (iD != -1) {
                cyqVar.a().putInt(str, iD);
                return;
            }
            return;
        }
        if (yks.e(str, this.u)) {
            int iD2 = this.C.d(i);
            if (iD2 != -1) {
                cyqVar.a().putInt(str, iD2);
                return;
            }
            return;
        }
        cfc cfcVar = cffVar.c;
        if (cfcVar.f(cfb.a) && bundle != null && yks.e(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strC != null ? strC.length() : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                    cgz cgzVarI = ccf.i(cfcVar);
                    if (cgzVarI != null) {
                        ArrayList arrayList = new ArrayList();
                        int i5 = 0;
                        while (i5 < i4) {
                            int i6 = i3 + i5;
                            RectF rectF = null;
                            if (i6 >= cgzVarI.a.a.a()) {
                                arrayList.add(null);
                                cgzVar = cgzVarI;
                                i2 = i5;
                            } else {
                                bmy bmyVarI = cgzVarI.l(i6).i(cffVar.a());
                                bmy bmyVarC = cffVar.c();
                                bmy bmyVarG = bmyVarI.k(bmyVarC) ? bmyVarI.g(bmyVarC) : null;
                                if (bmyVarG != null) {
                                    cbc cbcVar = this.b;
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(bmyVarG.b);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(bmyVarG.c);
                                    float f = bmyVarG.d;
                                    long jD = cbcVar.d((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
                                    i2 = i5;
                                    long jD2 = cbcVar.d((jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(bmyVarG.e) & 4294967295L));
                                    int i7 = (int) (jD2 >> 32);
                                    int i8 = (int) (jD >> 32);
                                    cgzVar = cgzVarI;
                                    int i9 = (int) (jD2 & 4294967295L);
                                    int i10 = (int) (jD & 4294967295L);
                                    rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)));
                                } else {
                                    cgzVar = cgzVarI;
                                    i2 = i5;
                                }
                                arrayList.add(rectF);
                            }
                            i5 = i2 + 1;
                            cgzVarI = cgzVar;
                        }
                        cyqVar.a().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        cfm cfmVar = cfi.y;
        if (cfcVar.f(cfmVar) && bundle != null && yks.e(str, "androidx.compose.ui.semantics.testTag")) {
            String str3 = (String) ccf.t(cfcVar, cfmVar);
            if (str3 != null) {
                cyqVar.a().putCharSequence(str, str3);
                return;
            }
            return;
        }
        if (yks.e(str, "androidx.compose.ui.semantics.id")) {
            cyqVar.a().putInt(str, cffVar.e);
            return;
        }
        if (yks.e(str, "androidx.compose.ui.semantics.shapeType")) {
            bol bolVar2 = (bol) ccf.t(cfcVar, cfi.O);
            if (bolVar2 != null) {
                boe boeVarG = G(bolVar2, cffVar);
                if (boeVarG instanceof boc) {
                    cyqVar.a().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    cyqVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", J(boeVarG));
                    return;
                } else if (boeVarG instanceof bod) {
                    cyqVar.a().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    cyqVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", J(boeVarG));
                    cyqVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(boeVarG));
                    return;
                } else {
                    if (!(boeVarG instanceof bob)) {
                        throw new yfu();
                    }
                    cyqVar.a().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    cyqVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", K(boeVarG));
                    return;
                }
            }
            return;
        }
        if (yks.e(str, "androidx.compose.ui.semantics.shapeRect")) {
            bol bolVar3 = (bol) ccf.t(cfcVar, cfi.O);
            if (bolVar3 == null || (rectJ = J(G(bolVar3, cffVar))) == null) {
                return;
            }
            cyqVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", rectJ);
            return;
        }
        if (yks.e(str, "androidx.compose.ui.semantics.shapeCorners")) {
            bol bolVar4 = (bol) ccf.t(cfcVar, cfi.O);
            if (bolVar4 == null || (fArrI = I(G(bolVar4, cffVar))) == null) {
                return;
            }
            cyqVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
            return;
        }
        if (!yks.e(str, "androidx.compose.ui.semantics.shapeRegion") || (bolVar = (bol) ccf.t(cfcVar, cfi.O)) == null || (regionK = K(G(bolVar, cffVar))) == null) {
            return;
        }
        cyqVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionK);
    }

    public final void k(bys bysVar) {
        if (this.K.add(bysVar)) {
            this.L.b(ygi.a);
        }
    }

    public final void l(cdn cdnVar) {
        if (cdnVar.v()) {
            cbc cbcVar = this.b;
            cbcVar.w.d(cdnVar, this.N, new bmq(cdnVar, this, 8));
        }
    }

    public final void m(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventE = e(d(i), 32);
        accessibilityEventE.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventE.getText().add(str);
        }
        D(accessibilityEventE);
    }

    public final void n(int i) {
        cbg cbgVar = this.s;
        if (cbgVar != null) {
            cff cffVar = cbgVar.a;
            int i2 = cffVar.e;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - cbgVar.f <= 1000) {
                AccessibilityEvent accessibilityEventE = e(d(i2), 131072);
                accessibilityEventE.setFromIndex(cbgVar.d);
                accessibilityEventE.setToIndex(cbgVar.e);
                accessibilityEventE.setAction(cbgVar.b);
                accessibilityEventE.setMovementGranularity(cbgVar.c);
                accessibilityEventE.getText().add(C(cffVar));
                D(accessibilityEventE);
            }
        }
        this.s = null;
    }

    public final void o(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        y(this, i, 128, null, 12);
        y(this, i2, 256, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(boolean r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbi.p(boolean, int, long):boolean");
    }

    public final boolean q(int i) {
        return this.i == i;
    }

    public final boolean r() {
        return this.d.isEnabled() && !this.g.isEmpty();
    }

    public final boolean s() {
        if (yks.e(null, true)) {
            return true;
        }
        if (yks.e(null, false)) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.d;
        if (Build.VERSION.SDK_INT >= 34) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
        return true;
    }

    public final boolean t() {
        AccessibilityManager accessibilityManager = this.d;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final boolean x(cff cffVar, int i, int i2, boolean z) {
        String strC;
        cfc cfcVar = cffVar.c;
        cfm cfmVar = cfb.i;
        if (cfcVar.f(cfmVar) && cbp.B(cffVar)) {
            return ((Boolean) ((yka) ((ces) cfcVar.b(cfmVar)).b).a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.p) || (strC = C(cffVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strC.length()) {
            i = -1;
        }
        this.p = i;
        boolean z2 = strC.length() > 0;
        int i3 = cffVar.e;
        D(f(d(i3), z2 ? Integer.valueOf(this.p) : null, z2 ? Integer.valueOf(this.p) : null, z2 ? Integer.valueOf(strC.length()) : null, strC));
        n(i3);
        return true;
    }
}
