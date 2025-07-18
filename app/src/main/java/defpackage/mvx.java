package defpackage;

import android.util.Log;
import com.google.android.libraries.elements.interfaces.LoggingDelegate;
import com.google.android.libraries.elements.interfaces.LoggingLevel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvx extends LoggingDelegate {
    @Override // com.google.android.libraries.elements.interfaces.LoggingDelegate
    public final void log(LoggingLevel loggingLevel, String str, String str2) {
        int i;
        LoggingLevel loggingLevel2 = LoggingLevel.LOG_LEVEL_ERROR;
        int iOrdinal = loggingLevel.ordinal();
        if (iOrdinal == 0) {
            i = 6;
        } else if (iOrdinal == 1) {
            i = 5;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            i = 4;
        }
        Log.println(i, str, str2);
    }
}
