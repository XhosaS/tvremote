package androidx.slice;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.a;
import defpackage.aff;
import defpackage.afg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceItem extends CustomVersionedParcelable {
    public String[] a;
    public String b;
    public String c;
    public Object d;
    SliceItemHolder e;

    public SliceItem() {
        this.a = Slice.a;
        this.b = "text";
        this.c = null;
    }

    public final int a() {
        aff.a(this.d, "Object must be non-null for FORMAT_INT");
        return ((Integer) this.d).intValue();
    }

    public final long b() {
        aff.a(this.d, "Object must be non-null for FORMAT_LONG");
        return ((Long) this.d).longValue();
    }

    public final Slice c() {
        aff.a(this.d, "Object must be non-null for FORMAT_SLICE");
        return "action".equals(this.b) ? (Slice) ((afg) this.d).b : (Slice) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItem.d(java.lang.String):java.lang.String");
    }

    public final String toString() {
        return d("");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public SliceItem(Bundle bundle) {
        this.a = Slice.a;
        this.b = "text";
        Object afgVar = null;
        this.c = null;
        this.a = bundle.getStringArray("hints");
        this.b = bundle.getString("format");
        this.c = bundle.getString("subtype");
        String str = this.b;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals("action")) {
                    afgVar = new afg(bundle.getParcelable("obj"), new Slice(bundle.getBundle("obj_2")));
                    this.d = afgVar;
                    return;
                }
                break;
            case -1377881982:
                if (str.equals("bundle")) {
                    afgVar = bundle.getBundle("obj");
                    this.d = afgVar;
                    return;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    afgVar = Integer.valueOf(bundle.getInt("obj"));
                    this.d = afgVar;
                    return;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    afgVar = Long.valueOf(bundle.getLong("obj"));
                    this.d = afgVar;
                    return;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    afgVar = bundle.getCharSequence("obj");
                    this.d = afgVar;
                    return;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    Bundle bundle2 = bundle.getBundle("obj");
                    int i = bundle2.getInt("type");
                    IconCompat iconCompat = new IconCompat(i);
                    iconCompat.f = bundle2.getInt("int1");
                    iconCompat.g = bundle2.getInt("int2");
                    iconCompat.k = bundle2.getString("string1");
                    if (bundle2.containsKey("tint_list")) {
                        iconCompat.h = (ColorStateList) bundle2.getParcelable("tint_list");
                    }
                    if (bundle2.containsKey("tint_mode")) {
                        iconCompat.i = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
                    }
                    switch (i) {
                        case -1:
                        case 1:
                        case 5:
                            iconCompat.c = bundle2.getParcelable("obj");
                            afgVar = iconCompat;
                            break;
                        case 0:
                        default:
                            Log.w("IconCompat", a.b(i, "Unknown type "));
                            break;
                        case 2:
                        case 4:
                        case 6:
                            iconCompat.c = bundle2.getString("obj");
                            afgVar = iconCompat;
                            break;
                        case 3:
                            iconCompat.c = bundle2.getByteArray("obj");
                            afgVar = iconCompat;
                            break;
                    }
                    this.d = afgVar;
                    return;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    afgVar = bundle.getParcelable("obj");
                    this.d = afgVar;
                    return;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    afgVar = new Slice(bundle.getBundle("obj"));
                    this.d = afgVar;
                    return;
                }
                break;
        }
        throw new RuntimeException("Unsupported type ".concat(String.valueOf(str)));
    }
}
