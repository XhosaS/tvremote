package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ar {
    public final q a;
    public final awy c;
    private final as d;
    private boolean e = false;
    public int b = -1;

    public ar(awy awyVar, as asVar, q qVar) {
        this.c = awyVar;
        this.d = asVar;
        this.a = qVar;
    }

    final void a() {
        q qVar;
        View view;
        View view2;
        q qVar2 = this.a;
        View view3 = qVar2.K;
        while (true) {
            qVar = null;
            if (view3 == null) {
                break;
            }
            q qVarD = am.d(view3);
            if (qVarD != null) {
                qVar = qVarD;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        q qVar3 = qVar2.z;
        if (qVar != null && !qVar.equals(qVar3)) {
            int i = qVar2.B;
            int i2 = up.a;
            qVar2.getClass();
            ut utVar = new ut(qVar2, qVar, i);
            up.d(utVar);
            uo uoVarB = up.b(qVar2);
            if (uoVarB.b.contains(un.e) && up.e(uoVarB, qVar2.getClass(), utVar.getClass())) {
                up.c(uoVarB, utVar);
            }
        }
        as asVar = this.d;
        ViewGroup viewGroup = qVar2.K;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = asVar.a;
            int iIndexOf = arrayList.indexOf(qVar2);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        q qVar4 = (q) arrayList.get(iIndexOf);
                        if (qVar4.K == viewGroup && (view = qVar4.L) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    q qVar5 = (q) arrayList.get(i3);
                    if (qVar5.K == viewGroup && (view2 = qVar5.L) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        qVar2.K.addView(qVar2.L, iIndexOfChild);
    }

    final void b() throws Resources.NotFoundException {
        String resourceName;
        q qVar = this.a;
        if (qVar.q) {
            return;
        }
        if (am.S(3)) {
            Objects.toString(qVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(qVar)));
        }
        Bundle bundle = qVar.c;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterI = qVar.I();
        ViewGroup viewGroup2 = qVar.K;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = qVar.B;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(b.b(qVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) qVar.w.m.a(i);
                if (viewGroup == null) {
                    if (!qVar.t && !qVar.s) {
                        try {
                            resourceName = qVar.g().getResources().getResourceName(qVar.B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        q qVar2 = this.a;
                        sb.append(Integer.toHexString(qVar2.B));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(qVar2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof w)) {
                    q qVar3 = this.a;
                    int i2 = up.a;
                    qVar3.getClass();
                    us usVar = new us(qVar3, viewGroup);
                    up.d(usVar);
                    uo uoVarB = up.b(qVar3);
                    if (uoVarB.b.contains(un.i) && up.e(uoVarB, qVar3.getClass(), usVar.getClass())) {
                        up.c(uoVarB, usVar);
                    }
                }
            }
        }
        q qVar4 = this.a;
        qVar4.K = viewGroup;
        qVar4.H(layoutInflaterI, viewGroup);
        if (qVar4.L != null) {
            if (am.S(3)) {
                Objects.toString(qVar4);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(qVar4)));
            }
            qVar4.L.setSaveFromParentEnabled(false);
            qVar4.L.setTag(R.id.fragment_container_view_tag, qVar4);
            if (viewGroup != null) {
                a();
            }
            if (qVar4.D) {
                qVar4.L.setVisibility(8);
            }
            if (qVar4.L.isAttachedToWindow()) {
                View view = qVar4.L;
                int[] iArr = qv.a;
                qk.j(view);
            } else {
                View view2 = qVar4.L;
                view2.addOnAttachStateChangeListener(new dm(view2, 1));
            }
            qVar4.t();
            this.c.R(qVar4, qVar4.L, bundle2, false);
            int visibility = qVar4.L.getVisibility();
            qVar4.h().l = qVar4.L.getAlpha();
            if (qVar4.K != null && visibility == 0) {
                View viewFindFocus = qVar4.L.findFocus();
                if (viewFindFocus != null) {
                    qVar4.w(viewFindFocus);
                    if (am.S(2)) {
                        Log.v("FragmentManager", b.d(qVar4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                qVar4.L.setAlpha(0.0f);
            }
        }
        qVar4.b = 2;
    }

    final void c() {
        q qVar = this.a;
        if (qVar.q && qVar.r && !qVar.u) {
            if (am.S(3)) {
                Objects.toString(qVar);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(qVar)));
            }
            Bundle bundle = qVar.c;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            qVar.H(qVar.I(), null);
            View view = qVar.L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                qVar.L.setTag(R.id.fragment_container_view_tag, qVar);
                if (qVar.D) {
                    qVar.L.setVisibility(8);
                }
                qVar.t();
                this.c.R(qVar, qVar.L, bundle2, false);
                qVar.b = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:384:0x044d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x044d, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f0 A[Catch: all -> 0x07a2, TryCatch #0 {all -> 0x07a2, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01c5, B:113:0x01cc, B:94:0x014b, B:114:0x01e5, B:115:0x01e9, B:117:0x01ef, B:118:0x01ff, B:120:0x021a, B:121:0x0221, B:122:0x022d, B:124:0x0231, B:126:0x0235, B:128:0x024d, B:129:0x025d, B:130:0x0260, B:131:0x0264, B:133:0x026a, B:134:0x027a, B:136:0x027e, B:138:0x0284, B:140:0x0295, B:141:0x02a5, B:143:0x02a9, B:145:0x02ad, B:146:0x02b0, B:148:0x02b4, B:149:0x02bb, B:151:0x02c3, B:152:0x02ca, B:153:0x02d8, B:154:0x02e0, B:156:0x02e6, B:157:0x02f6, B:159:0x02fa, B:160:0x02fe, B:162:0x0302, B:164:0x0325, B:165:0x0328, B:167:0x032e, B:168:0x033a, B:169:0x0345, B:170:0x0346, B:171:0x034d, B:173:0x0353, B:174:0x0363, B:177:0x036b, B:179:0x0375, B:190:0x03ce, B:191:0x03d1, B:193:0x03e9, B:194:0x03f5, B:196:0x0413, B:197:0x041b, B:199:0x0421, B:200:0x042b, B:201:0x043c, B:202:0x0447, B:180:0x037f, B:181:0x039e, B:182:0x039f, B:184:0x03a3, B:187:0x03ac, B:188:0x03cb, B:203:0x0448, B:204:0x044a, B:206:0x0450, B:208:0x0456, B:209:0x0466, B:211:0x046f, B:212:0x0476, B:213:0x0489, B:214:0x048c, B:216:0x0492, B:217:0x04a2, B:219:0x04ab, B:220:0x04b2, B:221:0x04c5, B:223:0x04cb, B:224:0x04df, B:226:0x04e5, B:228:0x04e9, B:229:0x04ec, B:231:0x04f0, B:233:0x04f4, B:235:0x0502, B:236:0x0512, B:237:0x0515, B:238:0x0519, B:239:0x051f, B:241:0x0525, B:242:0x0535, B:244:0x0539, B:246:0x053d, B:247:0x0540, B:249:0x0549, B:251:0x0559, B:252:0x0560, B:254:0x0575, B:255:0x0581, B:256:0x0599, B:258:0x05a1, B:259:0x05b1, B:261:0x05b5, B:266:0x05c0, B:268:0x05cb, B:271:0x05d6, B:273:0x05da, B:275:0x05e0, B:277:0x05e4, B:278:0x05e6, B:279:0x05ea, B:281:0x05f0, B:284:0x0602, B:286:0x0607, B:287:0x060e, B:289:0x0627, B:290:0x0636, B:292:0x063c, B:294:0x0644, B:296:0x0650, B:297:0x0655, B:299:0x0659, B:300:0x065f, B:301:0x0664, B:302:0x066f, B:282:0x05f7, B:303:0x0670, B:305:0x0676, B:306:0x0686, B:308:0x0693, B:310:0x0699, B:311:0x06a3, B:313:0x06b4, B:319:0x06c7, B:321:0x06cd, B:322:0x06db, B:316:0x06bb, B:323:0x06e0, B:324:0x06eb, B:327:0x06f0, B:329:0x06f4, B:331:0x06fa, B:333:0x0702, B:334:0x0716, B:336:0x0726, B:337:0x0738, B:338:0x073b, B:340:0x073f, B:342:0x0743, B:344:0x0747, B:346:0x0753, B:348:0x0759, B:349:0x0769, B:350:0x076d, B:352:0x0773, B:353:0x0783, B:354:0x0786, B:356:0x078a, B:358:0x078e, B:360:0x0794, B:361:0x0796, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:367:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f7 A[Catch: all -> 0x07a2, TryCatch #0 {all -> 0x07a2, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01c5, B:113:0x01cc, B:94:0x014b, B:114:0x01e5, B:115:0x01e9, B:117:0x01ef, B:118:0x01ff, B:120:0x021a, B:121:0x0221, B:122:0x022d, B:124:0x0231, B:126:0x0235, B:128:0x024d, B:129:0x025d, B:130:0x0260, B:131:0x0264, B:133:0x026a, B:134:0x027a, B:136:0x027e, B:138:0x0284, B:140:0x0295, B:141:0x02a5, B:143:0x02a9, B:145:0x02ad, B:146:0x02b0, B:148:0x02b4, B:149:0x02bb, B:151:0x02c3, B:152:0x02ca, B:153:0x02d8, B:154:0x02e0, B:156:0x02e6, B:157:0x02f6, B:159:0x02fa, B:160:0x02fe, B:162:0x0302, B:164:0x0325, B:165:0x0328, B:167:0x032e, B:168:0x033a, B:169:0x0345, B:170:0x0346, B:171:0x034d, B:173:0x0353, B:174:0x0363, B:177:0x036b, B:179:0x0375, B:190:0x03ce, B:191:0x03d1, B:193:0x03e9, B:194:0x03f5, B:196:0x0413, B:197:0x041b, B:199:0x0421, B:200:0x042b, B:201:0x043c, B:202:0x0447, B:180:0x037f, B:181:0x039e, B:182:0x039f, B:184:0x03a3, B:187:0x03ac, B:188:0x03cb, B:203:0x0448, B:204:0x044a, B:206:0x0450, B:208:0x0456, B:209:0x0466, B:211:0x046f, B:212:0x0476, B:213:0x0489, B:214:0x048c, B:216:0x0492, B:217:0x04a2, B:219:0x04ab, B:220:0x04b2, B:221:0x04c5, B:223:0x04cb, B:224:0x04df, B:226:0x04e5, B:228:0x04e9, B:229:0x04ec, B:231:0x04f0, B:233:0x04f4, B:235:0x0502, B:236:0x0512, B:237:0x0515, B:238:0x0519, B:239:0x051f, B:241:0x0525, B:242:0x0535, B:244:0x0539, B:246:0x053d, B:247:0x0540, B:249:0x0549, B:251:0x0559, B:252:0x0560, B:254:0x0575, B:255:0x0581, B:256:0x0599, B:258:0x05a1, B:259:0x05b1, B:261:0x05b5, B:266:0x05c0, B:268:0x05cb, B:271:0x05d6, B:273:0x05da, B:275:0x05e0, B:277:0x05e4, B:278:0x05e6, B:279:0x05ea, B:281:0x05f0, B:284:0x0602, B:286:0x0607, B:287:0x060e, B:289:0x0627, B:290:0x0636, B:292:0x063c, B:294:0x0644, B:296:0x0650, B:297:0x0655, B:299:0x0659, B:300:0x065f, B:301:0x0664, B:302:0x066f, B:282:0x05f7, B:303:0x0670, B:305:0x0676, B:306:0x0686, B:308:0x0693, B:310:0x0699, B:311:0x06a3, B:313:0x06b4, B:319:0x06c7, B:321:0x06cd, B:322:0x06db, B:316:0x06bb, B:323:0x06e0, B:324:0x06eb, B:327:0x06f0, B:329:0x06f4, B:331:0x06fa, B:333:0x0702, B:334:0x0716, B:336:0x0726, B:337:0x0738, B:338:0x073b, B:340:0x073f, B:342:0x0743, B:344:0x0747, B:346:0x0753, B:348:0x0759, B:349:0x0769, B:350:0x076d, B:352:0x0773, B:353:0x0783, B:354:0x0786, B:356:0x078a, B:358:0x078e, B:360:0x0794, B:361:0x0796, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:367:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0602 A[Catch: all -> 0x07a2, TryCatch #0 {all -> 0x07a2, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01c5, B:113:0x01cc, B:94:0x014b, B:114:0x01e5, B:115:0x01e9, B:117:0x01ef, B:118:0x01ff, B:120:0x021a, B:121:0x0221, B:122:0x022d, B:124:0x0231, B:126:0x0235, B:128:0x024d, B:129:0x025d, B:130:0x0260, B:131:0x0264, B:133:0x026a, B:134:0x027a, B:136:0x027e, B:138:0x0284, B:140:0x0295, B:141:0x02a5, B:143:0x02a9, B:145:0x02ad, B:146:0x02b0, B:148:0x02b4, B:149:0x02bb, B:151:0x02c3, B:152:0x02ca, B:153:0x02d8, B:154:0x02e0, B:156:0x02e6, B:157:0x02f6, B:159:0x02fa, B:160:0x02fe, B:162:0x0302, B:164:0x0325, B:165:0x0328, B:167:0x032e, B:168:0x033a, B:169:0x0345, B:170:0x0346, B:171:0x034d, B:173:0x0353, B:174:0x0363, B:177:0x036b, B:179:0x0375, B:190:0x03ce, B:191:0x03d1, B:193:0x03e9, B:194:0x03f5, B:196:0x0413, B:197:0x041b, B:199:0x0421, B:200:0x042b, B:201:0x043c, B:202:0x0447, B:180:0x037f, B:181:0x039e, B:182:0x039f, B:184:0x03a3, B:187:0x03ac, B:188:0x03cb, B:203:0x0448, B:204:0x044a, B:206:0x0450, B:208:0x0456, B:209:0x0466, B:211:0x046f, B:212:0x0476, B:213:0x0489, B:214:0x048c, B:216:0x0492, B:217:0x04a2, B:219:0x04ab, B:220:0x04b2, B:221:0x04c5, B:223:0x04cb, B:224:0x04df, B:226:0x04e5, B:228:0x04e9, B:229:0x04ec, B:231:0x04f0, B:233:0x04f4, B:235:0x0502, B:236:0x0512, B:237:0x0515, B:238:0x0519, B:239:0x051f, B:241:0x0525, B:242:0x0535, B:244:0x0539, B:246:0x053d, B:247:0x0540, B:249:0x0549, B:251:0x0559, B:252:0x0560, B:254:0x0575, B:255:0x0581, B:256:0x0599, B:258:0x05a1, B:259:0x05b1, B:261:0x05b5, B:266:0x05c0, B:268:0x05cb, B:271:0x05d6, B:273:0x05da, B:275:0x05e0, B:277:0x05e4, B:278:0x05e6, B:279:0x05ea, B:281:0x05f0, B:284:0x0602, B:286:0x0607, B:287:0x060e, B:289:0x0627, B:290:0x0636, B:292:0x063c, B:294:0x0644, B:296:0x0650, B:297:0x0655, B:299:0x0659, B:300:0x065f, B:301:0x0664, B:302:0x066f, B:282:0x05f7, B:303:0x0670, B:305:0x0676, B:306:0x0686, B:308:0x0693, B:310:0x0699, B:311:0x06a3, B:313:0x06b4, B:319:0x06c7, B:321:0x06cd, B:322:0x06db, B:316:0x06bb, B:323:0x06e0, B:324:0x06eb, B:327:0x06f0, B:329:0x06f4, B:331:0x06fa, B:333:0x0702, B:334:0x0716, B:336:0x0726, B:337:0x0738, B:338:0x073b, B:340:0x073f, B:342:0x0743, B:344:0x0747, B:346:0x0753, B:348:0x0759, B:349:0x0769, B:350:0x076d, B:352:0x0773, B:353:0x0783, B:354:0x0786, B:356:0x078a, B:358:0x078e, B:360:0x0794, B:361:0x0796, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:367:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0627 A[Catch: all -> 0x07a2, TryCatch #0 {all -> 0x07a2, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011b, B:88:0x012f, B:90:0x0135, B:91:0x0145, B:96:0x014f, B:104:0x0163, B:106:0x016d, B:109:0x0186, B:99:0x0154, B:101:0x015a, B:103:0x015e, B:110:0x01a6, B:112:0x01c5, B:113:0x01cc, B:94:0x014b, B:114:0x01e5, B:115:0x01e9, B:117:0x01ef, B:118:0x01ff, B:120:0x021a, B:121:0x0221, B:122:0x022d, B:124:0x0231, B:126:0x0235, B:128:0x024d, B:129:0x025d, B:130:0x0260, B:131:0x0264, B:133:0x026a, B:134:0x027a, B:136:0x027e, B:138:0x0284, B:140:0x0295, B:141:0x02a5, B:143:0x02a9, B:145:0x02ad, B:146:0x02b0, B:148:0x02b4, B:149:0x02bb, B:151:0x02c3, B:152:0x02ca, B:153:0x02d8, B:154:0x02e0, B:156:0x02e6, B:157:0x02f6, B:159:0x02fa, B:160:0x02fe, B:162:0x0302, B:164:0x0325, B:165:0x0328, B:167:0x032e, B:168:0x033a, B:169:0x0345, B:170:0x0346, B:171:0x034d, B:173:0x0353, B:174:0x0363, B:177:0x036b, B:179:0x0375, B:190:0x03ce, B:191:0x03d1, B:193:0x03e9, B:194:0x03f5, B:196:0x0413, B:197:0x041b, B:199:0x0421, B:200:0x042b, B:201:0x043c, B:202:0x0447, B:180:0x037f, B:181:0x039e, B:182:0x039f, B:184:0x03a3, B:187:0x03ac, B:188:0x03cb, B:203:0x0448, B:204:0x044a, B:206:0x0450, B:208:0x0456, B:209:0x0466, B:211:0x046f, B:212:0x0476, B:213:0x0489, B:214:0x048c, B:216:0x0492, B:217:0x04a2, B:219:0x04ab, B:220:0x04b2, B:221:0x04c5, B:223:0x04cb, B:224:0x04df, B:226:0x04e5, B:228:0x04e9, B:229:0x04ec, B:231:0x04f0, B:233:0x04f4, B:235:0x0502, B:236:0x0512, B:237:0x0515, B:238:0x0519, B:239:0x051f, B:241:0x0525, B:242:0x0535, B:244:0x0539, B:246:0x053d, B:247:0x0540, B:249:0x0549, B:251:0x0559, B:252:0x0560, B:254:0x0575, B:255:0x0581, B:256:0x0599, B:258:0x05a1, B:259:0x05b1, B:261:0x05b5, B:266:0x05c0, B:268:0x05cb, B:271:0x05d6, B:273:0x05da, B:275:0x05e0, B:277:0x05e4, B:278:0x05e6, B:279:0x05ea, B:281:0x05f0, B:284:0x0602, B:286:0x0607, B:287:0x060e, B:289:0x0627, B:290:0x0636, B:292:0x063c, B:294:0x0644, B:296:0x0650, B:297:0x0655, B:299:0x0659, B:300:0x065f, B:301:0x0664, B:302:0x066f, B:282:0x05f7, B:303:0x0670, B:305:0x0676, B:306:0x0686, B:308:0x0693, B:310:0x0699, B:311:0x06a3, B:313:0x06b4, B:319:0x06c7, B:321:0x06cd, B:322:0x06db, B:316:0x06bb, B:323:0x06e0, B:324:0x06eb, B:327:0x06f0, B:329:0x06f4, B:331:0x06fa, B:333:0x0702, B:334:0x0716, B:336:0x0726, B:337:0x0738, B:338:0x073b, B:340:0x073f, B:342:0x0743, B:344:0x0747, B:346:0x0753, B:348:0x0759, B:349:0x0769, B:350:0x076d, B:352:0x0773, B:353:0x0783, B:354:0x0786, B:356:0x078a, B:358:0x078e, B:360:0x0794, B:361:0x0796, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ac, B:49:0x00b0, B:51:0x00b6, B:54:0x00bc, B:60:0x00c6, B:69:0x00e5, B:71:0x00e9, B:73:0x00ed, B:74:0x00f1, B:76:0x00f5, B:77:0x00f9, B:79:0x00ff, B:62:0x00cd, B:63:0x00d2, B:65:0x00d6, B:67:0x00dc, B:68:0x00e1, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:367:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0664 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d() {
        /*
            Method dump skipped, instructions count: 1998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.d():void");
    }

    final void e(ClassLoader classLoader) {
        q qVar = this.a;
        Bundle bundle = qVar.c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (qVar.c.getBundle("savedInstanceState") == null) {
            qVar.c.putBundle("savedInstanceState", new Bundle());
        }
        try {
            qVar.d = qVar.c.getSparseParcelableArray("viewState");
            q qVar2 = this.a;
            qVar2.e = qVar2.c.getBundle("viewRegistryState");
            aq aqVar = (aq) qVar2.c.getParcelable("state");
            if (aqVar != null) {
                qVar2.j = aqVar.m;
                qVar2.k = aqVar.n;
                Boolean bool = qVar2.f;
                qVar2.N = aqVar.o;
            }
            if (qVar2.N) {
                return;
            }
            qVar2.M = true;
        } catch (BadParcelableException e) {
            q qVar3 = this.a;
            Objects.toString(qVar3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(qVar3)), e);
        }
    }

    final void f() {
        q qVar = this.a;
        if (qVar.L == null) {
            return;
        }
        if (am.S(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + qVar + " with view " + qVar.L);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        qVar.L.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            qVar.d = sparseArray;
        }
        Bundle bundle = new Bundle();
        qVar.U.b.l(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        qVar.e = bundle;
    }

    public ar(awy awyVar, as asVar, q qVar, Bundle bundle) {
        this.c = awyVar;
        this.d = asVar;
        this.a = qVar;
        qVar.d = null;
        qVar.e = null;
        qVar.v = 0;
        qVar.r = false;
        qVar.m = false;
        q qVar2 = qVar.i;
        qVar.j = qVar2 != null ? qVar2.g : null;
        qVar.i = null;
        qVar.c = bundle;
        qVar.h = bundle.getBundle("arguments");
    }

    public ar(awy awyVar, as asVar, ClassLoader classLoader, x xVar, Bundle bundle) {
        this.c = awyVar;
        this.d = asVar;
        aq aqVar = (aq) bundle.getParcelable("state");
        q qVarB = xVar.b(aqVar.a);
        qVarB.g = aqVar.b;
        qVarB.q = aqVar.c;
        qVarB.s = aqVar.d;
        qVarB.t = true;
        qVarB.A = aqVar.e;
        qVarB.B = aqVar.f;
        qVarB.C = aqVar.g;
        qVarB.F = aqVar.h;
        qVarB.n = aqVar.i;
        qVarB.E = aqVar.j;
        qVarB.D = aqVar.k;
        qVarB.T = xb.values()[aqVar.l];
        qVarB.j = aqVar.m;
        qVarB.k = aqVar.n;
        qVarB.N = aqVar.o;
        this.a = qVarB;
        qVarB.c = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        am amVar = qVarB.w;
        if (amVar != null && amVar.V()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        qVarB.h = bundle2;
        if (am.S(2)) {
            Objects.toString(qVarB);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(qVarB)));
        }
    }
}
