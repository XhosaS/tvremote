package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class dm {
    public final ci a;
    public final bq b;
    private final dn d;
    private boolean e = false;
    public int c = -1;

    public dm(ci ciVar, dn dnVar, bq bqVar) {
        this.a = ciVar;
        this.d = dnVar;
        this.b = bqVar;
    }

    final void a() {
        View view;
        View view2;
        bq bqVar = this.b;
        bq bqVarC = de.c(bqVar.Q);
        bq bqVar2 = bqVar.F;
        if (bqVarC != null && !bqVarC.equals(bqVar2)) {
            int i = bqVar.H;
            asx asxVar = asx.a;
            bqVar.getClass();
            ate ateVar = new ate(bqVar, bqVarC, i);
            asx asxVar2 = asx.a;
            asxVar2.c(ateVar);
            asw aswVarA = asxVar2.a(bqVar);
            if (aswVarA.b.contains(asv.e) && asxVar2.e(aswVarA, bqVar.getClass(), ateVar.getClass())) {
                asxVar2.b(aswVarA, ateVar);
            }
        }
        dn dnVar = this.d;
        ViewGroup viewGroup = bqVar.Q;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = dnVar.a;
            int iIndexOf = arrayList.indexOf(bqVar);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        bq bqVar3 = (bq) arrayList.get(iIndexOf);
                        if (bqVar3.Q == viewGroup && (view = bqVar3.R) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    bq bqVar4 = (bq) arrayList.get(i2);
                    if (bqVar4.Q == viewGroup && (view2 = bqVar4.R) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        bqVar.Q.addView(bqVar.R, iIndexOfChild);
    }

    final void b() throws Resources.NotFoundException {
        String resourceName;
        bq bqVar = this.b;
        if (bqVar.w) {
            return;
        }
        if (de.S(3)) {
            Objects.toString(bqVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(bqVar)));
        }
        Bundle bundle = bqVar.i;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterEi = bqVar.ei(bundle2);
        ViewGroup viewGroup2 = bqVar.Q;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = bqVar.H;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.c(bqVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bqVar.C.o.a(i);
                if (viewGroup == null) {
                    if (!bqVar.z && !bqVar.y) {
                        try {
                            resourceName = bqVar.dZ().getResources().getResourceName(bqVar.H);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        bq bqVar2 = this.b;
                        sb.append(Integer.toHexString(bqVar2.H));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(bqVar2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof cb)) {
                    bq bqVar3 = this.b;
                    asx asxVar = asx.a;
                    bqVar3.getClass();
                    atd atdVar = new atd(bqVar3, viewGroup);
                    asx asxVar2 = asx.a;
                    asxVar2.c(atdVar);
                    asw aswVarA = asxVar2.a(bqVar3);
                    if (aswVarA.b.contains(asv.i) && asxVar2.e(aswVarA, bqVar3.getClass(), atdVar.getClass())) {
                        asxVar2.b(aswVarA, atdVar);
                    }
                }
            }
        }
        bq bqVar4 = this.b;
        bqVar4.Q = viewGroup;
        bqVar4.dI(layoutInflaterEi, viewGroup, bundle2);
        if (bqVar4.R != null) {
            if (de.S(3)) {
                Objects.toString(bqVar4);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(bqVar4)));
            }
            bqVar4.R.setSaveFromParentEnabled(false);
            bqVar4.R.setTag(R.id.fragment_container_view_tag, bqVar4);
            if (viewGroup != null) {
                a();
            }
            if (bqVar4.J) {
                bqVar4.R.setVisibility(8);
            }
            if (bqVar4.R.isAttachedToWindow()) {
                View view = bqVar4.R;
                int[] iArr = ahj.a;
                aha.c(view);
            } else {
                View view2 = bqVar4.R;
                view2.addOnAttachStateChangeListener(new dl(view2));
            }
            bqVar4.ab();
            this.a.m(bqVar4, bqVar4.R, bundle2, false);
            int visibility = bqVar4.R.getVisibility();
            bqVar4.eb().o = bqVar4.R.getAlpha();
            if (bqVar4.Q != null && visibility == 0) {
                View viewFindFocus = bqVar4.R.findFocus();
                if (viewFindFocus != null) {
                    bqVar4.eb().p = viewFindFocus;
                    if (de.S(2)) {
                        Log.v("FragmentManager", a.d(bqVar4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                bqVar4.R.setAlpha(0.0f);
            }
        }
        bqVar4.h = 2;
    }

    final void c() {
        bq bqVar = this.b;
        if (bqVar.w && bqVar.x && !bqVar.A) {
            if (de.S(3)) {
                Objects.toString(bqVar);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(bqVar)));
            }
            Bundle bundle = bqVar.i;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            bqVar.dI(bqVar.ei(bundle2), null, bundle2);
            View view = bqVar.R;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bqVar.R.setTag(R.id.fragment_container_view_tag, bqVar);
                if (bqVar.J) {
                    bqVar.R.setVisibility(8);
                }
                bqVar.ab();
                this.a.m(bqVar, bqVar.R, bundle2, false);
                bqVar.h = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x0498, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0498, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x067a A[Catch: all -> 0x0834, TryCatch #0 {all -> 0x0834, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011d, B:88:0x0131, B:90:0x0137, B:91:0x0147, B:96:0x0151, B:104:0x0165, B:106:0x016f, B:109:0x0188, B:99:0x0156, B:101:0x015c, B:103:0x0160, B:110:0x01a8, B:112:0x01c4, B:114:0x01cf, B:115:0x01d8, B:116:0x01f1, B:117:0x01fc, B:94:0x014d, B:118:0x01fd, B:119:0x0201, B:121:0x0207, B:122:0x0217, B:124:0x022c, B:126:0x0237, B:127:0x0240, B:128:0x024c, B:129:0x0257, B:130:0x0258, B:132:0x025c, B:134:0x0260, B:136:0x027c, B:137:0x028c, B:138:0x028f, B:139:0x0293, B:141:0x0299, B:142:0x02a9, B:144:0x02ad, B:146:0x02b3, B:148:0x02c3, B:150:0x02c9, B:151:0x02d9, B:153:0x02dd, B:155:0x02e1, B:157:0x02e7, B:159:0x02eb, B:160:0x02f2, B:162:0x02fb, B:164:0x02ff, B:165:0x0309, B:166:0x0314, B:167:0x0315, B:168:0x0323, B:169:0x032e, B:170:0x032f, B:171:0x0337, B:173:0x033d, B:174:0x034d, B:176:0x0351, B:177:0x0355, B:179:0x0359, B:181:0x037a, B:182:0x0386, B:183:0x0391, B:184:0x0392, B:185:0x0399, B:187:0x039f, B:188:0x03af, B:191:0x03b7, B:193:0x03c1, B:204:0x041a, B:205:0x041d, B:207:0x0435, B:208:0x0441, B:210:0x045e, B:211:0x0466, B:213:0x046c, B:214:0x0476, B:215:0x0487, B:216:0x0492, B:194:0x03cb, B:195:0x03ea, B:196:0x03eb, B:198:0x03ef, B:201:0x03f8, B:202:0x0417, B:217:0x0493, B:218:0x0495, B:220:0x049b, B:222:0x04a1, B:223:0x04b1, B:225:0x04ba, B:226:0x04c3, B:228:0x04d5, B:229:0x04db, B:230:0x04e6, B:231:0x04e7, B:232:0x04ea, B:234:0x04f0, B:235:0x0500, B:237:0x0509, B:238:0x0512, B:240:0x0524, B:241:0x052b, B:242:0x0536, B:243:0x0537, B:245:0x053d, B:246:0x0551, B:248:0x0557, B:250:0x055b, B:251:0x055e, B:253:0x0562, B:255:0x0566, B:257:0x0576, B:258:0x0586, B:259:0x0589, B:260:0x058d, B:261:0x0593, B:263:0x0599, B:264:0x05a9, B:266:0x05ad, B:268:0x05b1, B:269:0x05b4, B:271:0x05bd, B:273:0x05ce, B:274:0x05d7, B:276:0x05e2, B:278:0x05f3, B:279:0x05ff, B:280:0x0617, B:281:0x0622, B:282:0x0623, B:284:0x062b, B:285:0x063b, B:287:0x063f, B:292:0x064a, B:294:0x0655, B:297:0x0660, B:299:0x0664, B:301:0x066a, B:303:0x066e, B:304:0x0670, B:305:0x0674, B:307:0x067a, B:313:0x0692, B:315:0x0697, B:316:0x069e, B:318:0x06b7, B:319:0x06c6, B:321:0x06cc, B:323:0x06d4, B:325:0x06e0, B:326:0x06e5, B:328:0x06e9, B:329:0x06ef, B:330:0x06f4, B:331:0x06ff, B:308:0x0681, B:310:0x0687, B:332:0x0700, B:334:0x0706, B:335:0x0716, B:337:0x0723, B:339:0x0729, B:340:0x0733, B:342:0x0744, B:348:0x0757, B:350:0x075d, B:351:0x076b, B:345:0x074b, B:352:0x0770, B:353:0x077b, B:356:0x0780, B:358:0x0784, B:360:0x078a, B:362:0x0792, B:363:0x07a6, B:365:0x07b6, B:366:0x07c8, B:367:0x07cb, B:369:0x07cf, B:371:0x07d3, B:373:0x07d7, B:375:0x07e5, B:377:0x07eb, B:378:0x07fb, B:379:0x07ff, B:381:0x0805, B:382:0x0815, B:383:0x0818, B:385:0x081c, B:387:0x0820, B:389:0x0826, B:390:0x0828, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ae, B:49:0x00b2, B:51:0x00b8, B:54:0x00be, B:60:0x00c8, B:69:0x00e7, B:71:0x00eb, B:73:0x00ef, B:74:0x00f3, B:76:0x00f7, B:77:0x00fb, B:79:0x0101, B:62:0x00cf, B:63:0x00d4, B:65:0x00d8, B:67:0x00de, B:68:0x00e3, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:396:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0681 A[Catch: all -> 0x0834, TryCatch #0 {all -> 0x0834, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011d, B:88:0x0131, B:90:0x0137, B:91:0x0147, B:96:0x0151, B:104:0x0165, B:106:0x016f, B:109:0x0188, B:99:0x0156, B:101:0x015c, B:103:0x0160, B:110:0x01a8, B:112:0x01c4, B:114:0x01cf, B:115:0x01d8, B:116:0x01f1, B:117:0x01fc, B:94:0x014d, B:118:0x01fd, B:119:0x0201, B:121:0x0207, B:122:0x0217, B:124:0x022c, B:126:0x0237, B:127:0x0240, B:128:0x024c, B:129:0x0257, B:130:0x0258, B:132:0x025c, B:134:0x0260, B:136:0x027c, B:137:0x028c, B:138:0x028f, B:139:0x0293, B:141:0x0299, B:142:0x02a9, B:144:0x02ad, B:146:0x02b3, B:148:0x02c3, B:150:0x02c9, B:151:0x02d9, B:153:0x02dd, B:155:0x02e1, B:157:0x02e7, B:159:0x02eb, B:160:0x02f2, B:162:0x02fb, B:164:0x02ff, B:165:0x0309, B:166:0x0314, B:167:0x0315, B:168:0x0323, B:169:0x032e, B:170:0x032f, B:171:0x0337, B:173:0x033d, B:174:0x034d, B:176:0x0351, B:177:0x0355, B:179:0x0359, B:181:0x037a, B:182:0x0386, B:183:0x0391, B:184:0x0392, B:185:0x0399, B:187:0x039f, B:188:0x03af, B:191:0x03b7, B:193:0x03c1, B:204:0x041a, B:205:0x041d, B:207:0x0435, B:208:0x0441, B:210:0x045e, B:211:0x0466, B:213:0x046c, B:214:0x0476, B:215:0x0487, B:216:0x0492, B:194:0x03cb, B:195:0x03ea, B:196:0x03eb, B:198:0x03ef, B:201:0x03f8, B:202:0x0417, B:217:0x0493, B:218:0x0495, B:220:0x049b, B:222:0x04a1, B:223:0x04b1, B:225:0x04ba, B:226:0x04c3, B:228:0x04d5, B:229:0x04db, B:230:0x04e6, B:231:0x04e7, B:232:0x04ea, B:234:0x04f0, B:235:0x0500, B:237:0x0509, B:238:0x0512, B:240:0x0524, B:241:0x052b, B:242:0x0536, B:243:0x0537, B:245:0x053d, B:246:0x0551, B:248:0x0557, B:250:0x055b, B:251:0x055e, B:253:0x0562, B:255:0x0566, B:257:0x0576, B:258:0x0586, B:259:0x0589, B:260:0x058d, B:261:0x0593, B:263:0x0599, B:264:0x05a9, B:266:0x05ad, B:268:0x05b1, B:269:0x05b4, B:271:0x05bd, B:273:0x05ce, B:274:0x05d7, B:276:0x05e2, B:278:0x05f3, B:279:0x05ff, B:280:0x0617, B:281:0x0622, B:282:0x0623, B:284:0x062b, B:285:0x063b, B:287:0x063f, B:292:0x064a, B:294:0x0655, B:297:0x0660, B:299:0x0664, B:301:0x066a, B:303:0x066e, B:304:0x0670, B:305:0x0674, B:307:0x067a, B:313:0x0692, B:315:0x0697, B:316:0x069e, B:318:0x06b7, B:319:0x06c6, B:321:0x06cc, B:323:0x06d4, B:325:0x06e0, B:326:0x06e5, B:328:0x06e9, B:329:0x06ef, B:330:0x06f4, B:331:0x06ff, B:308:0x0681, B:310:0x0687, B:332:0x0700, B:334:0x0706, B:335:0x0716, B:337:0x0723, B:339:0x0729, B:340:0x0733, B:342:0x0744, B:348:0x0757, B:350:0x075d, B:351:0x076b, B:345:0x074b, B:352:0x0770, B:353:0x077b, B:356:0x0780, B:358:0x0784, B:360:0x078a, B:362:0x0792, B:363:0x07a6, B:365:0x07b6, B:366:0x07c8, B:367:0x07cb, B:369:0x07cf, B:371:0x07d3, B:373:0x07d7, B:375:0x07e5, B:377:0x07eb, B:378:0x07fb, B:379:0x07ff, B:381:0x0805, B:382:0x0815, B:383:0x0818, B:385:0x081c, B:387:0x0820, B:389:0x0826, B:390:0x0828, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ae, B:49:0x00b2, B:51:0x00b8, B:54:0x00be, B:60:0x00c8, B:69:0x00e7, B:71:0x00eb, B:73:0x00ef, B:74:0x00f3, B:76:0x00f7, B:77:0x00fb, B:79:0x0101, B:62:0x00cf, B:63:0x00d4, B:65:0x00d8, B:67:0x00de, B:68:0x00e3, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:396:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0692 A[Catch: all -> 0x0834, TryCatch #0 {all -> 0x0834, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011d, B:88:0x0131, B:90:0x0137, B:91:0x0147, B:96:0x0151, B:104:0x0165, B:106:0x016f, B:109:0x0188, B:99:0x0156, B:101:0x015c, B:103:0x0160, B:110:0x01a8, B:112:0x01c4, B:114:0x01cf, B:115:0x01d8, B:116:0x01f1, B:117:0x01fc, B:94:0x014d, B:118:0x01fd, B:119:0x0201, B:121:0x0207, B:122:0x0217, B:124:0x022c, B:126:0x0237, B:127:0x0240, B:128:0x024c, B:129:0x0257, B:130:0x0258, B:132:0x025c, B:134:0x0260, B:136:0x027c, B:137:0x028c, B:138:0x028f, B:139:0x0293, B:141:0x0299, B:142:0x02a9, B:144:0x02ad, B:146:0x02b3, B:148:0x02c3, B:150:0x02c9, B:151:0x02d9, B:153:0x02dd, B:155:0x02e1, B:157:0x02e7, B:159:0x02eb, B:160:0x02f2, B:162:0x02fb, B:164:0x02ff, B:165:0x0309, B:166:0x0314, B:167:0x0315, B:168:0x0323, B:169:0x032e, B:170:0x032f, B:171:0x0337, B:173:0x033d, B:174:0x034d, B:176:0x0351, B:177:0x0355, B:179:0x0359, B:181:0x037a, B:182:0x0386, B:183:0x0391, B:184:0x0392, B:185:0x0399, B:187:0x039f, B:188:0x03af, B:191:0x03b7, B:193:0x03c1, B:204:0x041a, B:205:0x041d, B:207:0x0435, B:208:0x0441, B:210:0x045e, B:211:0x0466, B:213:0x046c, B:214:0x0476, B:215:0x0487, B:216:0x0492, B:194:0x03cb, B:195:0x03ea, B:196:0x03eb, B:198:0x03ef, B:201:0x03f8, B:202:0x0417, B:217:0x0493, B:218:0x0495, B:220:0x049b, B:222:0x04a1, B:223:0x04b1, B:225:0x04ba, B:226:0x04c3, B:228:0x04d5, B:229:0x04db, B:230:0x04e6, B:231:0x04e7, B:232:0x04ea, B:234:0x04f0, B:235:0x0500, B:237:0x0509, B:238:0x0512, B:240:0x0524, B:241:0x052b, B:242:0x0536, B:243:0x0537, B:245:0x053d, B:246:0x0551, B:248:0x0557, B:250:0x055b, B:251:0x055e, B:253:0x0562, B:255:0x0566, B:257:0x0576, B:258:0x0586, B:259:0x0589, B:260:0x058d, B:261:0x0593, B:263:0x0599, B:264:0x05a9, B:266:0x05ad, B:268:0x05b1, B:269:0x05b4, B:271:0x05bd, B:273:0x05ce, B:274:0x05d7, B:276:0x05e2, B:278:0x05f3, B:279:0x05ff, B:280:0x0617, B:281:0x0622, B:282:0x0623, B:284:0x062b, B:285:0x063b, B:287:0x063f, B:292:0x064a, B:294:0x0655, B:297:0x0660, B:299:0x0664, B:301:0x066a, B:303:0x066e, B:304:0x0670, B:305:0x0674, B:307:0x067a, B:313:0x0692, B:315:0x0697, B:316:0x069e, B:318:0x06b7, B:319:0x06c6, B:321:0x06cc, B:323:0x06d4, B:325:0x06e0, B:326:0x06e5, B:328:0x06e9, B:329:0x06ef, B:330:0x06f4, B:331:0x06ff, B:308:0x0681, B:310:0x0687, B:332:0x0700, B:334:0x0706, B:335:0x0716, B:337:0x0723, B:339:0x0729, B:340:0x0733, B:342:0x0744, B:348:0x0757, B:350:0x075d, B:351:0x076b, B:345:0x074b, B:352:0x0770, B:353:0x077b, B:356:0x0780, B:358:0x0784, B:360:0x078a, B:362:0x0792, B:363:0x07a6, B:365:0x07b6, B:366:0x07c8, B:367:0x07cb, B:369:0x07cf, B:371:0x07d3, B:373:0x07d7, B:375:0x07e5, B:377:0x07eb, B:378:0x07fb, B:379:0x07ff, B:381:0x0805, B:382:0x0815, B:383:0x0818, B:385:0x081c, B:387:0x0820, B:389:0x0826, B:390:0x0828, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ae, B:49:0x00b2, B:51:0x00b8, B:54:0x00be, B:60:0x00c8, B:69:0x00e7, B:71:0x00eb, B:73:0x00ef, B:74:0x00f3, B:76:0x00f7, B:77:0x00fb, B:79:0x0101, B:62:0x00cf, B:63:0x00d4, B:65:0x00d8, B:67:0x00de, B:68:0x00e3, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:396:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b7 A[Catch: all -> 0x0834, TryCatch #0 {all -> 0x0834, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x011d, B:88:0x0131, B:90:0x0137, B:91:0x0147, B:96:0x0151, B:104:0x0165, B:106:0x016f, B:109:0x0188, B:99:0x0156, B:101:0x015c, B:103:0x0160, B:110:0x01a8, B:112:0x01c4, B:114:0x01cf, B:115:0x01d8, B:116:0x01f1, B:117:0x01fc, B:94:0x014d, B:118:0x01fd, B:119:0x0201, B:121:0x0207, B:122:0x0217, B:124:0x022c, B:126:0x0237, B:127:0x0240, B:128:0x024c, B:129:0x0257, B:130:0x0258, B:132:0x025c, B:134:0x0260, B:136:0x027c, B:137:0x028c, B:138:0x028f, B:139:0x0293, B:141:0x0299, B:142:0x02a9, B:144:0x02ad, B:146:0x02b3, B:148:0x02c3, B:150:0x02c9, B:151:0x02d9, B:153:0x02dd, B:155:0x02e1, B:157:0x02e7, B:159:0x02eb, B:160:0x02f2, B:162:0x02fb, B:164:0x02ff, B:165:0x0309, B:166:0x0314, B:167:0x0315, B:168:0x0323, B:169:0x032e, B:170:0x032f, B:171:0x0337, B:173:0x033d, B:174:0x034d, B:176:0x0351, B:177:0x0355, B:179:0x0359, B:181:0x037a, B:182:0x0386, B:183:0x0391, B:184:0x0392, B:185:0x0399, B:187:0x039f, B:188:0x03af, B:191:0x03b7, B:193:0x03c1, B:204:0x041a, B:205:0x041d, B:207:0x0435, B:208:0x0441, B:210:0x045e, B:211:0x0466, B:213:0x046c, B:214:0x0476, B:215:0x0487, B:216:0x0492, B:194:0x03cb, B:195:0x03ea, B:196:0x03eb, B:198:0x03ef, B:201:0x03f8, B:202:0x0417, B:217:0x0493, B:218:0x0495, B:220:0x049b, B:222:0x04a1, B:223:0x04b1, B:225:0x04ba, B:226:0x04c3, B:228:0x04d5, B:229:0x04db, B:230:0x04e6, B:231:0x04e7, B:232:0x04ea, B:234:0x04f0, B:235:0x0500, B:237:0x0509, B:238:0x0512, B:240:0x0524, B:241:0x052b, B:242:0x0536, B:243:0x0537, B:245:0x053d, B:246:0x0551, B:248:0x0557, B:250:0x055b, B:251:0x055e, B:253:0x0562, B:255:0x0566, B:257:0x0576, B:258:0x0586, B:259:0x0589, B:260:0x058d, B:261:0x0593, B:263:0x0599, B:264:0x05a9, B:266:0x05ad, B:268:0x05b1, B:269:0x05b4, B:271:0x05bd, B:273:0x05ce, B:274:0x05d7, B:276:0x05e2, B:278:0x05f3, B:279:0x05ff, B:280:0x0617, B:281:0x0622, B:282:0x0623, B:284:0x062b, B:285:0x063b, B:287:0x063f, B:292:0x064a, B:294:0x0655, B:297:0x0660, B:299:0x0664, B:301:0x066a, B:303:0x066e, B:304:0x0670, B:305:0x0674, B:307:0x067a, B:313:0x0692, B:315:0x0697, B:316:0x069e, B:318:0x06b7, B:319:0x06c6, B:321:0x06cc, B:323:0x06d4, B:325:0x06e0, B:326:0x06e5, B:328:0x06e9, B:329:0x06ef, B:330:0x06f4, B:331:0x06ff, B:308:0x0681, B:310:0x0687, B:332:0x0700, B:334:0x0706, B:335:0x0716, B:337:0x0723, B:339:0x0729, B:340:0x0733, B:342:0x0744, B:348:0x0757, B:350:0x075d, B:351:0x076b, B:345:0x074b, B:352:0x0770, B:353:0x077b, B:356:0x0780, B:358:0x0784, B:360:0x078a, B:362:0x0792, B:363:0x07a6, B:365:0x07b6, B:366:0x07c8, B:367:0x07cb, B:369:0x07cf, B:371:0x07d3, B:373:0x07d7, B:375:0x07e5, B:377:0x07eb, B:378:0x07fb, B:379:0x07ff, B:381:0x0805, B:382:0x0815, B:383:0x0818, B:385:0x081c, B:387:0x0820, B:389:0x0826, B:390:0x0828, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:26:0x005f, B:28:0x0069, B:30:0x006f, B:31:0x0074, B:33:0x0078, B:34:0x007f, B:35:0x0083, B:37:0x0087, B:39:0x008b, B:40:0x008f, B:42:0x0093, B:43:0x0097, B:45:0x009b, B:47:0x00ae, B:49:0x00b2, B:51:0x00b8, B:54:0x00be, B:60:0x00c8, B:69:0x00e7, B:71:0x00eb, B:73:0x00ef, B:74:0x00f3, B:76:0x00f7, B:77:0x00fb, B:79:0x0101, B:62:0x00cf, B:63:0x00d4, B:65:0x00d8, B:67:0x00de, B:68:0x00e3, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:396:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d() {
        /*
            Method dump skipped, instructions count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.d():void");
    }

    final void e(ClassLoader classLoader) {
        bq bqVar = this.b;
        Bundle bundle = bqVar.i;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bqVar.i.getBundle("savedInstanceState") == null) {
            bqVar.i.putBundle("savedInstanceState", new Bundle());
        }
        try {
            bqVar.j = bqVar.i.getSparseParcelableArray("viewState");
            bq bqVar2 = this.b;
            bqVar2.k = bqVar2.i.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) bqVar2.i.getParcelable("state");
            if (fragmentState != null) {
                bqVar2.p = fragmentState.m;
                bqVar2.q = fragmentState.n;
                Boolean bool = bqVar2.l;
                bqVar2.T = fragmentState.o;
            }
            if (bqVar2.T) {
                return;
            }
            bqVar2.S = true;
        } catch (BadParcelableException e) {
            bq bqVar3 = this.b;
            Objects.toString(bqVar3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(bqVar3)), e);
        }
    }

    final void f() {
        bq bqVar = this.b;
        if (bqVar.R == null) {
            return;
        }
        if (de.S(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + bqVar + " with view " + bqVar.R);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bqVar.R.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bqVar.j = sparseArray;
        }
        Bundle bundle = new Bundle();
        bqVar.ab.b.b.d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bqVar.k = bundle;
    }

    public dm(ci ciVar, dn dnVar, bq bqVar, Bundle bundle) {
        this.a = ciVar;
        this.d = dnVar;
        this.b = bqVar;
        bqVar.j = null;
        bqVar.k = null;
        bqVar.B = 0;
        bqVar.x = false;
        bqVar.s = false;
        bq bqVar2 = bqVar.o;
        bqVar.p = bqVar2 != null ? bqVar2.m : null;
        bqVar.o = null;
        bqVar.i = bundle;
        bqVar.n = bundle.getBundle("arguments");
    }

    public dm(ci ciVar, dn dnVar, ClassLoader classLoader, cd cdVar, Bundle bundle) {
        this.a = ciVar;
        this.d = dnVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        bq bqVarB = cdVar.b(fragmentState.a);
        bqVarB.m = fragmentState.b;
        bqVarB.w = fragmentState.c;
        bqVarB.y = fragmentState.d;
        bqVarB.z = true;
        bqVarB.G = fragmentState.e;
        bqVarB.H = fragmentState.f;
        bqVarB.I = fragmentState.g;
        bqVarB.L = fragmentState.h;
        bqVarB.t = fragmentState.i;
        bqVarB.K = fragmentState.j;
        bqVarB.J = fragmentState.k;
        bqVarB.Z = bcf.values()[fragmentState.l];
        bqVarB.p = fragmentState.m;
        bqVarB.q = fragmentState.n;
        bqVarB.T = fragmentState.o;
        this.b = bqVarB;
        bqVarB.i = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        bqVarB.ae(bundle2);
        if (de.S(2)) {
            Objects.toString(bqVarB);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(bqVarB)));
        }
    }
}
