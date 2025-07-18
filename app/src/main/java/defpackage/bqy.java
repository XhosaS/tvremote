package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.slice.Slice;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqy {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static Slice a(androidx.slice.Slice slice) {
        if (slice == null || Uri.parse(slice.f) == null) {
            return null;
        }
        Uri uri = Uri.parse(slice.f);
        SliceSpec sliceSpec = slice.c;
        Slice.Builder builder = new Slice.Builder(uri, sliceSpec == null ? null : new android.app.slice.SliceSpec(sliceSpec.a, sliceSpec.b));
        builder.addHints(Arrays.asList(slice.e));
        for (SliceItem sliceItem : slice.d) {
            String str = sliceItem.b;
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        aff.a(sliceItem.d, "Object must be non-null");
                        Object obj = ((afg) sliceItem.d).a;
                        builder.addAction(obj instanceof PendingIntent ? (PendingIntent) obj : null, a(sliceItem.c()), sliceItem.c);
                        break;
                    } else {
                        break;
                    }
                case -1377881982:
                    if (str.equals("bundle")) {
                        builder.addBundle((Bundle) sliceItem.d, sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 104431:
                    if (str.equals("int")) {
                        builder.addInt(sliceItem.a(), sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 3327612:
                    if (str.equals("long")) {
                        builder.addLong(sliceItem.b(), sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 3556653:
                    if (str.equals("text")) {
                        builder.addText((CharSequence) sliceItem.d, sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 100313435:
                    if (str.equals("image")) {
                        builder.addIcon(adi.a((IconCompat) sliceItem.d, null), sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 100358090:
                    if (str.equals("input")) {
                        builder.addRemoteInput((RemoteInput) sliceItem.d, sliceItem.c, Arrays.asList(sliceItem.a));
                        break;
                    } else {
                        break;
                    }
                case 109526418:
                    if (str.equals("slice")) {
                        builder.addSubSlice(a(sliceItem.c()), sliceItem.c);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return builder.build();
    }
}
