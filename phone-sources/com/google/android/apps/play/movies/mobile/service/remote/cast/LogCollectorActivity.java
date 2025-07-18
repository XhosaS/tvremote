package com.google.android.apps.play.movies.mobile.service.remote.cast;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LogCollectorActivity extends Activity {
    private static final List a = new ArrayList(Arrays.asList("logcat", "-v", "time", "-d"));
    private static final Set b;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("com.google.android.apps.eureka");
        hashSet.add("com.google.eureka.feedback");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0123: MOVE (r12 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:292), block:B:56:0x0122 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onStart() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.service.remote.cast.LogCollectorActivity.onStart():void");
    }
}
