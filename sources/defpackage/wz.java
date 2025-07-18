package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.view.View;
import com.google.android.tv.remote.service.R;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wz {
    public wz() {
    }

    public static xa a(xb xbVar) {
        xbVar.getClass();
        int iOrdinal = xbVar.ordinal();
        if (iOrdinal == 1) {
            return xa.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return xa.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return xa.ON_RESUME;
    }

    public static Calendar b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static void c(View view, aba abaVar) {
        view.setTag(R.id.view_tree_navigation_event_dispatcher_owner, abaVar);
    }

    public static cja d(cja cjaVar) {
        return chk.h(cjaVar, new byc(), chz.a);
    }

    public static void e(bgd bgdVar, HashMap map) {
        bdq.h(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        map.put("singleproc", bgdVar);
    }

    public static IOException f(bzt bztVar, Uri uri, IOException iOException, String str) {
        try {
            bfc bfcVar = new bfc();
            bfcVar.a = true;
            File file = (File) bztVar.g(uri, bfcVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? i(file, iOException, str) : i(file, iOException, str) : file.canWrite() ? i(file, iOException, str) : i(file, iOException, str) : file.canRead() ? file.canWrite() ? i(file, iOException, str) : i(file, iOException, str) : file.canWrite() ? i(file, iOException, str) : i(file, iOException, str) : i(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static awy g(abk abkVar) {
        return new awy(new abn(abkVar, new kh(abkVar, 8)));
    }

    private static IOException h(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException i(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? h(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : parentFile.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : h(file, iOException, str);
    }

    public wz(byte[] bArr) {
    }
}
