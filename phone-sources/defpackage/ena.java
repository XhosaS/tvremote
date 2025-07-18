package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ena implements ezz {
    private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public static final Long b(InputStream inputStream) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = a.matcher(line);
            if (!matcher.matches()) {
                throw new eaf(a.cr(line, "Couldn't parse timestamp: "), null, true, 4);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = true != "+".equals(matcher.group(4)) ? -1L : 1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= j * (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new eaf(null, e, true, 4);
        }
    }

    @Override // defpackage.ezz
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        return b(inputStream);
    }
}
