package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import defpackage.crn;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static TwilightManager sInstance;
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState = new TwilightState();

    /* compiled from: PG */
    class TwilightState {
        boolean isNight;
        long nextUpdate;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.mContext = context;
        this.mLocationManager = locationManager;
    }

    static TwilightManager getInstance(Context context) {
        if (sInstance == null) {
            Context applicationContext = context.getApplicationContext();
            sInstance = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return sInstance;
    }

    private Location getLastKnownLocation() {
        Location lastKnownLocationForProvider = crn.b(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? getLastKnownLocationForProvider("network") : null;
        Location lastKnownLocationForProvider2 = crn.b(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0 ? getLastKnownLocationForProvider("gps") : null;
        return (lastKnownLocationForProvider2 == null || lastKnownLocationForProvider == null ? lastKnownLocationForProvider2 == null : lastKnownLocationForProvider2.getTime() <= lastKnownLocationForProvider.getTime()) ? lastKnownLocationForProvider : lastKnownLocationForProvider2;
    }

    private Location getLastKnownLocationForProvider(String str) {
        try {
            if (this.mLocationManager.isProviderEnabled(str)) {
                return this.mLocationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean isStateValid() {
        return this.mTwilightState.nextUpdate > System.currentTimeMillis();
    }

    static void setInstance(TwilightManager twilightManager) {
        sInstance = twilightManager;
    }

    private void updateState(Location location) {
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TwilightCalculator twilightCalculator = TwilightCalculator.getInstance();
        twilightCalculator.calculateTwilight(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        twilightCalculator.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        int i = twilightCalculator.state;
        long j2 = twilightCalculator.sunrise;
        long j3 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j4 = twilightCalculator.sunrise;
        if (j2 == -1 || j3 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        boolean z = i == 1;
        TwilightState twilightState = this.mTwilightState;
        twilightState.isNight = z;
        twilightState.nextUpdate = j;
    }

    public boolean isNight() {
        TwilightState twilightState = this.mTwilightState;
        if (isStateValid()) {
            return twilightState.isNight;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
