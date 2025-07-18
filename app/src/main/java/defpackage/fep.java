package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fep {
    public static final Duration a(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        Duration durationBetween = Duration.between(instant, instant2);
        durationBetween.getClass();
        return durationBetween;
    }

    public static final String b(Duration duration, Resources resources) {
        duration.getClass();
        resources.getClass();
        if (duration.isZero() || duration.isNegative()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int hours = (int) duration.toHours();
        if (hours > 0) {
            sb.append(c(hours, R.plurals.DescribeHoursDuration, resources));
            sb.append(" ");
        }
        sb.append(c(duration.toMinutesPart(), R.plurals.DescribeMinutesDuration, resources));
        sb.append(" ");
        sb.append(c(duration.toSecondsPart(), R.plurals.DescribeSecondsDuration, resources));
        return sb.toString();
    }

    private static final String c(int i, int i2, Resources resources) throws Resources.NotFoundException {
        String quantityString = resources.getQuantityString(i2, i, Integer.valueOf(i));
        quantityString.getClass();
        return quantityString;
    }
}
