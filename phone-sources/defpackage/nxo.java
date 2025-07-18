package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxo {
    private static nxo f;
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private boolean e;

    public nxo(bhi bhiVar, ajs ajsVar, bv bvVar) {
        this.e = false;
        this.a = -1;
        this.b = bhiVar;
        this.c = ajsVar;
        this.d = bvVar;
    }

    public static synchronized nxo l(Context context) {
        if (f == null) {
            f = new nxo(context);
        }
        return f;
    }

    private final void m() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            hnj hnjVar = (hnj) it.next();
            if (((WeakReference) hnjVar.b).get() == null) {
                copyOnWriteArrayList.remove(hnjVar);
            }
        }
    }

    public final void a(nxn nxnVar, nve nveVar, String str) {
        Object obj = this.b;
        ((ko) obj).put(nxnVar, nveVar);
        Object obj2 = this.c;
        ((ko) obj2).put(nxnVar, str);
        this.a--;
        if (!nveVar.c()) {
            this.e = true;
        }
        if (this.a == 0) {
            if (!this.e) {
                ((kwy) this.d).u(obj2);
            } else {
                ((kwy) this.d).t(new nwm((ir) obj));
            }
        }
    }

    public final int b() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public final void c(edf edfVar, Executor executor) {
        boolean z;
        m();
        hnj hnjVar = new hnj(this, edfVar, executor);
        synchronized (this.d) {
            ((CopyOnWriteArrayList) this.b).add(hnjVar);
            z = this.e;
        }
        if (z) {
            hnjVar.a();
        }
    }

    public final void d(int i) {
        m();
        synchronized (this.d) {
            if (this.e && this.a == i) {
                return;
            }
            this.e = true;
            this.a = i;
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((hnj) it.next()).a();
            }
        }
    }

    public final Bundle e() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bv bvVar = (bv) this.d;
        if (bvVar.mState == -1 && (bundle = bvVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new cw(bvVar));
        if (bvVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            bvVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            ((bhi) this.b).B(bvVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            bvVar.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleB = bvVar.mChildFragmentManager.b();
            if (!bundleB.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleB);
            }
            if (bvVar.mView != null) {
                k();
            }
            SparseArray<Parcelable> sparseArray = bvVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = bvVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = bvVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void f() {
        View view;
        View view2;
        Object obj = this.d;
        bv bvVar = (bv) obj;
        bv bvVarG = cr.g(bvVar.mContainer);
        bv parentFragment = bvVar.getParentFragment();
        if (bvVarG != null && !bvVarG.equals(parentFragment)) {
            int i = bvVar.mContainerId;
            int i2 = dia.a;
            obj.getClass();
            dim dimVar = new dim(bvVar, bvVarG, i);
            dia.d(dimVar);
            dhz dhzVarB = dia.b(bvVar);
            if (dhzVarB.b.contains(dhy.e) && dia.e(dhzVarB, obj.getClass(), dimVar.getClass())) {
                dia.c(dhzVarB, dimVar);
            }
        }
        Object obj2 = this.c;
        ViewGroup viewGroup = bvVar.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) ((ajs) obj2).b;
            int iIndexOf = arrayList.indexOf(obj);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        bv bvVar2 = (bv) arrayList.get(iIndexOf);
                        if (bvVar2.mContainer == viewGroup && (view = bvVar2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    bv bvVar3 = (bv) arrayList.get(i3);
                    if (bvVar3.mContainer == viewGroup && (view2 = bvVar3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        bvVar.mContainer.addView(bvVar.mView, iIndexOfChild);
    }

    final void g() throws Resources.NotFoundException {
        String resourceName;
        Object obj = this.d;
        bv bvVar = (bv) obj;
        if (bvVar.mFromLayout) {
            return;
        }
        if (cr.Y(3)) {
            Objects.toString(obj);
        }
        Bundle bundle = bvVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = bvVar.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = bvVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = bvVar.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.cj(obj, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bvVar.mFragmentManager.n.a(i);
                if (viewGroup == null) {
                    if (!bvVar.mRestored && !bvVar.mInDynamicContainer) {
                        try {
                            resourceName = ((bv) obj).getResources().getResourceName(((bv) obj).mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        Object obj2 = this.d;
                        sb.append(Integer.toHexString(((bv) obj2).mContainerId));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(obj2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Object obj3 = this.d;
                    int i2 = dia.a;
                    obj3.getClass();
                    bv bvVar2 = (bv) obj3;
                    dil dilVar = new dil(bvVar2, viewGroup);
                    dia.d(dilVar);
                    dhz dhzVarB = dia.b(bvVar2);
                    if (dhzVarB.b.contains(dhy.i) && dia.e(dhzVarB, obj3.getClass(), dilVar.getClass())) {
                        dia.c(dhzVarB, dilVar);
                    }
                }
            }
        }
        Object obj4 = this.d;
        bv bvVar3 = (bv) obj4;
        bvVar3.mContainer = viewGroup;
        bvVar3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (bvVar3.mView != null) {
            if (cr.Y(3)) {
                Objects.toString(obj4);
            }
            bvVar3.mView.setSaveFromParentEnabled(false);
            bvVar3.mView.setTag(R.id.fragment_container_view_tag, obj4);
            if (viewGroup != null) {
                f();
            }
            if (bvVar3.mHidden) {
                bvVar3.mView.setVisibility(8);
            }
            if (bvVar3.mView.isAttachedToWindow()) {
                View view = bvVar3.mView;
                int[] iArr = cww.a;
                cwk.e(view);
            } else {
                View view2 = bvVar3.mView;
                view2.addOnAttachStateChangeListener(new bne(view2, 1));
            }
            bvVar3.performViewCreated();
            ((bhi) this.b).E(bvVar3, bvVar3.mView, bundle2, false);
            int visibility = bvVar3.mView.getVisibility();
            bvVar3.setPostOnViewCreatedAlpha(bvVar3.mView.getAlpha());
            if (bvVar3.mContainer != null && visibility == 0) {
                View viewFindFocus = bvVar3.mView.findFocus();
                if (viewFindFocus != null) {
                    bvVar3.setFocusedView(viewFindFocus);
                    if (cr.Y(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(obj4);
                    }
                }
                bvVar3.mView.setAlpha(0.0f);
            }
        }
        bvVar3.mState = 2;
    }

    public final void h() {
        Object obj = this.d;
        bv bvVar = (bv) obj;
        if (bvVar.mFromLayout && bvVar.mInLayout && !bvVar.mPerformedCreateView) {
            if (cr.Y(3)) {
                Objects.toString(obj);
            }
            Bundle bundle = bvVar.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            bvVar.performCreateView(bvVar.performGetLayoutInflater(bundle2), null, bundle2);
            View view = bvVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bvVar.mView.setTag(R.id.fragment_container_view_tag, obj);
                if (bvVar.mHidden) {
                    bvVar.mView.setVisibility(8);
                }
                bvVar.performViewCreated();
                ((bhi) this.b).E(bvVar, bvVar.mView, bundle2, false);
                bvVar.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x033f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c5 A[Catch: all -> 0x0670, TryCatch #0 {all -> 0x0670, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:80:0x012c, B:87:0x013f, B:89:0x0145, B:90:0x0148, B:92:0x0151, B:100:0x016b, B:102:0x0174, B:95:0x0159, B:97:0x015f, B:99:0x0166, B:103:0x0186, B:104:0x01b8, B:105:0x01be, B:107:0x01c4, B:108:0x01c7, B:109:0x01d8, B:111:0x01df, B:113:0x01e6, B:115:0x0204, B:116:0x0207, B:117:0x020a, B:118:0x0210, B:120:0x0216, B:121:0x0219, B:123:0x0220, B:124:0x0224, B:125:0x0235, B:126:0x023d, B:128:0x0243, B:129:0x0246, B:131:0x024d, B:132:0x0251, B:134:0x0258, B:135:0x0272, B:136:0x027e, B:138:0x0284, B:139:0x0287, B:142:0x0294, B:144:0x02a0, B:155:0x030b, B:156:0x030e, B:145:0x02b3, B:146:0x02d4, B:147:0x02d5, B:149:0x02dc, B:152:0x02e7, B:153:0x0308, B:157:0x033a, B:158:0x033c, B:160:0x0342, B:162:0x0348, B:163:0x034b, B:164:0x035b, B:165:0x0360, B:167:0x0366, B:168:0x0369, B:169:0x0379, B:171:0x037f, B:172:0x0382, B:174:0x0389, B:180:0x03ab, B:182:0x03b2, B:184:0x03b9, B:186:0x03ca, B:187:0x03cd, B:188:0x03d0, B:175:0x039a, B:177:0x03a1, B:179:0x03a8, B:189:0x03d6, B:190:0x03e1, B:192:0x03e7, B:193:0x03ea, B:195:0x03f1, B:197:0x03f8, B:198:0x03fb, B:199:0x042d, B:201:0x0434, B:203:0x044a, B:204:0x0458, B:206:0x045e, B:207:0x0461, B:209:0x0468, B:214:0x0476, B:216:0x047d, B:218:0x048b, B:221:0x049e, B:223:0x04a5, B:225:0x04ad, B:227:0x04b1, B:228:0x04b6, B:229:0x04bc, B:231:0x04c5, B:234:0x04db, B:237:0x04e4, B:238:0x04f2, B:239:0x050f, B:241:0x0515, B:243:0x051d, B:245:0x052f, B:246:0x053c, B:248:0x0543, B:249:0x054e, B:232:0x04d0, B:250:0x0555, B:252:0x055b, B:253:0x055e, B:255:0x0589, B:261:0x05a6, B:263:0x05ac, B:264:0x05af, B:258:0x0593, B:267:0x05ba, B:269:0x05c1, B:271:0x05ca, B:273:0x05d1, B:275:0x05d7, B:276:0x05da, B:278:0x05f4, B:279:0x05f7, B:280:0x05fd, B:282:0x0604, B:284:0x060b, B:286:0x0612, B:288:0x0624, B:290:0x062a, B:291:0x062d, B:292:0x0631, B:294:0x0637, B:295:0x063a, B:296:0x063d, B:298:0x0644, B:300:0x064b, B:302:0x0654, B:303:0x0656, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x005f, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:33:0x007b, B:34:0x0085, B:35:0x0089, B:37:0x0090, B:39:0x0097, B:40:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00ad, B:47:0x00c4, B:49:0x00c8, B:51:0x00d1, B:54:0x00d7, B:60:0x00e1, B:69:0x0106, B:71:0x010d, B:73:0x0114, B:74:0x0118, B:76:0x011f, B:77:0x0123, B:79:0x0129, B:62:0x00e8, B:63:0x00ed, B:65:0x00f4, B:67:0x00fd, B:68:0x0102, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:309:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d0 A[Catch: all -> 0x0670, TryCatch #0 {all -> 0x0670, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:80:0x012c, B:87:0x013f, B:89:0x0145, B:90:0x0148, B:92:0x0151, B:100:0x016b, B:102:0x0174, B:95:0x0159, B:97:0x015f, B:99:0x0166, B:103:0x0186, B:104:0x01b8, B:105:0x01be, B:107:0x01c4, B:108:0x01c7, B:109:0x01d8, B:111:0x01df, B:113:0x01e6, B:115:0x0204, B:116:0x0207, B:117:0x020a, B:118:0x0210, B:120:0x0216, B:121:0x0219, B:123:0x0220, B:124:0x0224, B:125:0x0235, B:126:0x023d, B:128:0x0243, B:129:0x0246, B:131:0x024d, B:132:0x0251, B:134:0x0258, B:135:0x0272, B:136:0x027e, B:138:0x0284, B:139:0x0287, B:142:0x0294, B:144:0x02a0, B:155:0x030b, B:156:0x030e, B:145:0x02b3, B:146:0x02d4, B:147:0x02d5, B:149:0x02dc, B:152:0x02e7, B:153:0x0308, B:157:0x033a, B:158:0x033c, B:160:0x0342, B:162:0x0348, B:163:0x034b, B:164:0x035b, B:165:0x0360, B:167:0x0366, B:168:0x0369, B:169:0x0379, B:171:0x037f, B:172:0x0382, B:174:0x0389, B:180:0x03ab, B:182:0x03b2, B:184:0x03b9, B:186:0x03ca, B:187:0x03cd, B:188:0x03d0, B:175:0x039a, B:177:0x03a1, B:179:0x03a8, B:189:0x03d6, B:190:0x03e1, B:192:0x03e7, B:193:0x03ea, B:195:0x03f1, B:197:0x03f8, B:198:0x03fb, B:199:0x042d, B:201:0x0434, B:203:0x044a, B:204:0x0458, B:206:0x045e, B:207:0x0461, B:209:0x0468, B:214:0x0476, B:216:0x047d, B:218:0x048b, B:221:0x049e, B:223:0x04a5, B:225:0x04ad, B:227:0x04b1, B:228:0x04b6, B:229:0x04bc, B:231:0x04c5, B:234:0x04db, B:237:0x04e4, B:238:0x04f2, B:239:0x050f, B:241:0x0515, B:243:0x051d, B:245:0x052f, B:246:0x053c, B:248:0x0543, B:249:0x054e, B:232:0x04d0, B:250:0x0555, B:252:0x055b, B:253:0x055e, B:255:0x0589, B:261:0x05a6, B:263:0x05ac, B:264:0x05af, B:258:0x0593, B:267:0x05ba, B:269:0x05c1, B:271:0x05ca, B:273:0x05d1, B:275:0x05d7, B:276:0x05da, B:278:0x05f4, B:279:0x05f7, B:280:0x05fd, B:282:0x0604, B:284:0x060b, B:286:0x0612, B:288:0x0624, B:290:0x062a, B:291:0x062d, B:292:0x0631, B:294:0x0637, B:295:0x063a, B:296:0x063d, B:298:0x0644, B:300:0x064b, B:302:0x0654, B:303:0x0656, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x005f, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:33:0x007b, B:34:0x0085, B:35:0x0089, B:37:0x0090, B:39:0x0097, B:40:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00ad, B:47:0x00c4, B:49:0x00c8, B:51:0x00d1, B:54:0x00d7, B:60:0x00e1, B:69:0x0106, B:71:0x010d, B:73:0x0114, B:74:0x0118, B:76:0x011f, B:77:0x0123, B:79:0x0129, B:62:0x00e8, B:63:0x00ed, B:65:0x00f4, B:67:0x00fd, B:68:0x0102, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:309:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0515 A[Catch: all -> 0x0670, TryCatch #0 {all -> 0x0670, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:80:0x012c, B:87:0x013f, B:89:0x0145, B:90:0x0148, B:92:0x0151, B:100:0x016b, B:102:0x0174, B:95:0x0159, B:97:0x015f, B:99:0x0166, B:103:0x0186, B:104:0x01b8, B:105:0x01be, B:107:0x01c4, B:108:0x01c7, B:109:0x01d8, B:111:0x01df, B:113:0x01e6, B:115:0x0204, B:116:0x0207, B:117:0x020a, B:118:0x0210, B:120:0x0216, B:121:0x0219, B:123:0x0220, B:124:0x0224, B:125:0x0235, B:126:0x023d, B:128:0x0243, B:129:0x0246, B:131:0x024d, B:132:0x0251, B:134:0x0258, B:135:0x0272, B:136:0x027e, B:138:0x0284, B:139:0x0287, B:142:0x0294, B:144:0x02a0, B:155:0x030b, B:156:0x030e, B:145:0x02b3, B:146:0x02d4, B:147:0x02d5, B:149:0x02dc, B:152:0x02e7, B:153:0x0308, B:157:0x033a, B:158:0x033c, B:160:0x0342, B:162:0x0348, B:163:0x034b, B:164:0x035b, B:165:0x0360, B:167:0x0366, B:168:0x0369, B:169:0x0379, B:171:0x037f, B:172:0x0382, B:174:0x0389, B:180:0x03ab, B:182:0x03b2, B:184:0x03b9, B:186:0x03ca, B:187:0x03cd, B:188:0x03d0, B:175:0x039a, B:177:0x03a1, B:179:0x03a8, B:189:0x03d6, B:190:0x03e1, B:192:0x03e7, B:193:0x03ea, B:195:0x03f1, B:197:0x03f8, B:198:0x03fb, B:199:0x042d, B:201:0x0434, B:203:0x044a, B:204:0x0458, B:206:0x045e, B:207:0x0461, B:209:0x0468, B:214:0x0476, B:216:0x047d, B:218:0x048b, B:221:0x049e, B:223:0x04a5, B:225:0x04ad, B:227:0x04b1, B:228:0x04b6, B:229:0x04bc, B:231:0x04c5, B:234:0x04db, B:237:0x04e4, B:238:0x04f2, B:239:0x050f, B:241:0x0515, B:243:0x051d, B:245:0x052f, B:246:0x053c, B:248:0x0543, B:249:0x054e, B:232:0x04d0, B:250:0x0555, B:252:0x055b, B:253:0x055e, B:255:0x0589, B:261:0x05a6, B:263:0x05ac, B:264:0x05af, B:258:0x0593, B:267:0x05ba, B:269:0x05c1, B:271:0x05ca, B:273:0x05d1, B:275:0x05d7, B:276:0x05da, B:278:0x05f4, B:279:0x05f7, B:280:0x05fd, B:282:0x0604, B:284:0x060b, B:286:0x0612, B:288:0x0624, B:290:0x062a, B:291:0x062d, B:292:0x0631, B:294:0x0637, B:295:0x063a, B:296:0x063d, B:298:0x0644, B:300:0x064b, B:302:0x0654, B:303:0x0656, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x005f, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:33:0x007b, B:34:0x0085, B:35:0x0089, B:37:0x0090, B:39:0x0097, B:40:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00ad, B:47:0x00c4, B:49:0x00c8, B:51:0x00d1, B:54:0x00d7, B:60:0x00e1, B:69:0x0106, B:71:0x010d, B:73:0x0114, B:74:0x0118, B:76:0x011f, B:77:0x0123, B:79:0x0129, B:62:0x00e8, B:63:0x00ed, B:65:0x00f4, B:67:0x00fd, B:68:0x0102, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:309:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0543 A[Catch: all -> 0x0670, TryCatch #0 {all -> 0x0670, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:80:0x012c, B:87:0x013f, B:89:0x0145, B:90:0x0148, B:92:0x0151, B:100:0x016b, B:102:0x0174, B:95:0x0159, B:97:0x015f, B:99:0x0166, B:103:0x0186, B:104:0x01b8, B:105:0x01be, B:107:0x01c4, B:108:0x01c7, B:109:0x01d8, B:111:0x01df, B:113:0x01e6, B:115:0x0204, B:116:0x0207, B:117:0x020a, B:118:0x0210, B:120:0x0216, B:121:0x0219, B:123:0x0220, B:124:0x0224, B:125:0x0235, B:126:0x023d, B:128:0x0243, B:129:0x0246, B:131:0x024d, B:132:0x0251, B:134:0x0258, B:135:0x0272, B:136:0x027e, B:138:0x0284, B:139:0x0287, B:142:0x0294, B:144:0x02a0, B:155:0x030b, B:156:0x030e, B:145:0x02b3, B:146:0x02d4, B:147:0x02d5, B:149:0x02dc, B:152:0x02e7, B:153:0x0308, B:157:0x033a, B:158:0x033c, B:160:0x0342, B:162:0x0348, B:163:0x034b, B:164:0x035b, B:165:0x0360, B:167:0x0366, B:168:0x0369, B:169:0x0379, B:171:0x037f, B:172:0x0382, B:174:0x0389, B:180:0x03ab, B:182:0x03b2, B:184:0x03b9, B:186:0x03ca, B:187:0x03cd, B:188:0x03d0, B:175:0x039a, B:177:0x03a1, B:179:0x03a8, B:189:0x03d6, B:190:0x03e1, B:192:0x03e7, B:193:0x03ea, B:195:0x03f1, B:197:0x03f8, B:198:0x03fb, B:199:0x042d, B:201:0x0434, B:203:0x044a, B:204:0x0458, B:206:0x045e, B:207:0x0461, B:209:0x0468, B:214:0x0476, B:216:0x047d, B:218:0x048b, B:221:0x049e, B:223:0x04a5, B:225:0x04ad, B:227:0x04b1, B:228:0x04b6, B:229:0x04bc, B:231:0x04c5, B:234:0x04db, B:237:0x04e4, B:238:0x04f2, B:239:0x050f, B:241:0x0515, B:243:0x051d, B:245:0x052f, B:246:0x053c, B:248:0x0543, B:249:0x054e, B:232:0x04d0, B:250:0x0555, B:252:0x055b, B:253:0x055e, B:255:0x0589, B:261:0x05a6, B:263:0x05ac, B:264:0x05af, B:258:0x0593, B:267:0x05ba, B:269:0x05c1, B:271:0x05ca, B:273:0x05d1, B:275:0x05d7, B:276:0x05da, B:278:0x05f4, B:279:0x05f7, B:280:0x05fd, B:282:0x0604, B:284:0x060b, B:286:0x0612, B:288:0x0624, B:290:0x062a, B:291:0x062d, B:292:0x0631, B:294:0x0637, B:295:0x063a, B:296:0x063d, B:298:0x0644, B:300:0x064b, B:302:0x0654, B:303:0x0656, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x005f, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:33:0x007b, B:34:0x0085, B:35:0x0089, B:37:0x0090, B:39:0x0097, B:40:0x009b, B:42:0x00a2, B:43:0x00a6, B:45:0x00ad, B:47:0x00c4, B:49:0x00c8, B:51:0x00d1, B:54:0x00d7, B:60:0x00e1, B:69:0x0106, B:71:0x010d, B:73:0x0114, B:74:0x0118, B:76:0x011f, B:77:0x0123, B:79:0x0129, B:62:0x00e8, B:63:0x00ed, B:65:0x00f4, B:67:0x00fd, B:68:0x0102, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:309:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxo.i():void");
    }

    public final void j(ClassLoader classLoader) {
        Object obj = this.d;
        bv bvVar = (bv) obj;
        Bundle bundle = bvVar.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bvVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            bvVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ((bv) obj).mSavedViewState = ((bv) obj).mSavedFragmentState.getSparseParcelableArray("viewState");
            bv bvVar2 = (bv) this.d;
            bvVar2.mSavedViewRegistryState = bvVar2.mSavedFragmentState.getBundle("viewRegistryState");
            cw cwVar = (cw) bvVar2.mSavedFragmentState.getParcelable("state");
            if (cwVar != null) {
                bvVar2.mTargetWho = cwVar.m;
                bvVar2.mTargetRequestCode = cwVar.n;
                Boolean bool = bvVar2.mSavedUserVisibleHint;
                if (bool != null) {
                    bvVar2.mUserVisibleHint = bool.booleanValue();
                    bvVar2.mSavedUserVisibleHint = null;
                } else {
                    bvVar2.mUserVisibleHint = cwVar.o;
                }
            }
            if (bvVar2.mUserVisibleHint) {
                return;
            }
            bvVar2.mDeferStart = true;
        } catch (BadParcelableException e) {
            Object obj2 = this.d;
            Objects.toString(obj2);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(obj2)), e);
        }
    }

    final void k() {
        Object obj = this.d;
        bv bvVar = (bv) obj;
        if (bvVar.mView == null) {
            return;
        }
        if (cr.Y(2)) {
            Objects.toString(obj);
            Objects.toString(bvVar.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bvVar.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bvVar.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        bvVar.mViewLifecycleOwner.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bvVar.mSavedViewRegistryState = bundle;
    }

    public nxo(bhi bhiVar, ajs ajsVar, bv bvVar, Bundle bundle) {
        this.e = false;
        this.a = -1;
        this.b = bhiVar;
        this.c = ajsVar;
        this.d = bvVar;
        bvVar.mSavedViewState = null;
        bvVar.mSavedViewRegistryState = null;
        bvVar.mBackStackNesting = 0;
        bvVar.mInLayout = false;
        bvVar.mAdded = false;
        bv bvVar2 = bvVar.mTarget;
        bvVar.mTargetWho = bvVar2 != null ? bvVar2.mWho : null;
        bvVar.mTarget = null;
        bvVar.mSavedFragmentState = bundle;
        bvVar.mArguments = bundle.getBundle("arguments");
    }

    public nxo(bhi bhiVar, ajs ajsVar, ClassLoader classLoader, cc ccVar, Bundle bundle) {
        this.e = false;
        this.a = -1;
        this.b = bhiVar;
        this.c = ajsVar;
        cw cwVar = (cw) bundle.getParcelable("state");
        bv bvVarB = ccVar.b(cwVar.a);
        bvVarB.mWho = cwVar.b;
        bvVarB.mFromLayout = cwVar.c;
        bvVarB.mInDynamicContainer = cwVar.d;
        bvVarB.mRestored = true;
        bvVarB.mFragmentId = cwVar.e;
        bvVarB.mContainerId = cwVar.f;
        bvVarB.mTag = cwVar.g;
        bvVarB.mRetainInstance = cwVar.h;
        bvVarB.mRemoving = cwVar.i;
        bvVarB.mDetached = cwVar.j;
        bvVarB.mHidden = cwVar.k;
        bvVarB.mMaxState = dvd.values()[cwVar.l];
        bvVarB.mTargetWho = cwVar.m;
        bvVarB.mTargetRequestCode = cwVar.n;
        bvVarB.mUserVisibleHint = cwVar.o;
        this.d = bvVarB;
        bvVarB.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        bvVarB.setArguments(bundle2);
        if (cr.Y(2)) {
            Objects.toString(bvVarB);
        }
    }

    private nxo(Context context) {
        Executor executorX = clw.X();
        this.c = executorX;
        this.b = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        executorX.execute(new edd(this, context, 0, null));
    }

    public nxo(Iterable iterable) {
        this.c = new ir();
        this.d = new kwy((byte[]) null, (byte[]) null);
        this.e = false;
        this.b = new ir();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nwv nwvVar = (nwv) it.next();
            ((ko) this.b).put(nwvVar.n(), null);
        }
        this.a = ((ir) this.b).keySet().size();
    }
}
