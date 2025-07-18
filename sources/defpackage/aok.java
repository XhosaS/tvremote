package defpackage;

import android.os.PatternMatcher;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aok implements FilenameFilter {
    List a = new ArrayList();

    public aok(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Log.i("FILE_DELETION", "Adding glob path: " + file.getAbsolutePath() + File.separator + str);
            String strReplace = str.replace("*", ".*");
            this.a.add(new PatternMatcher(file.getAbsolutePath() + File.separator + strReplace, 2));
        }
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        String str2 = file.getAbsolutePath() + File.separator + str;
        for (PatternMatcher patternMatcher : this.a) {
            if (patternMatcher.match(str2)) {
                Log.i("FILE_DELETION", String.format("Deleting file '%s' which matches '%s'", str2, patternMatcher.getPath()));
                return true;
            }
        }
        return false;
    }
}
