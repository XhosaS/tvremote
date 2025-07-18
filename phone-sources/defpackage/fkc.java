package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private fkc(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static fkc a(String str) {
        a.H(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new fkc(i2, i3, i4, i5, i6, length);
            }
            String strJ = sij.J(strArrSplit[i].trim());
            switch (strJ.hashCode()) {
                case 100571:
                    if (!strJ.equals("end")) {
                        break;
                    } else {
                        i4 = i;
                        break;
                    }
                case 3556653:
                    if (!strJ.equals("text")) {
                        break;
                    } else {
                        i6 = i;
                        break;
                    }
                case 102749521:
                    if (!strJ.equals("layer")) {
                        break;
                    } else {
                        i2 = i;
                        break;
                    }
                case 109757538:
                    if (!strJ.equals("start")) {
                        break;
                    } else {
                        i3 = i;
                        break;
                    }
                case 109780401:
                    if (!strJ.equals("style")) {
                        break;
                    } else {
                        i5 = i;
                        break;
                    }
            }
            i++;
        }
    }

    public fkc(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.e = i;
        this.c = i2;
        this.f = i3;
        this.a = i4;
        this.d = i5;
        this.b = i6;
    }
}
