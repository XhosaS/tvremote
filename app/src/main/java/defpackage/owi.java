package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class owi {
    public static final owi a;
    public static final owi b;
    public static final owi c;
    public static final owi d;
    public static final owi e;
    public static final owi f;
    public static final owi g;
    public static final owi h;
    public static final owi i;
    public static final owi j;
    public static final owi k;
    public static final owi l;
    public static final owi m;
    private static final /* synthetic */ owi[] o;
    public final String n;

    static {
        owi owiVar = new owi("UPDATE_DEVICE_SETTINGS", 0, "device.update.settings");
        a = owiVar;
        owi owiVar2 = new owi("UPDATE_DEVICE_CAST_SETTINGS", 1, "device.update.cast_settings");
        b = owiVar2;
        owi owiVar3 = new owi("UPDATE_DEVICE_CLIP_LENDING", 2, "device.update.camera_lendclips");
        c = owiVar3;
        owi owiVar4 = new owi("EXECUTE_CAMERA_STREAM", 3, "device.execute.camera_stream");
        d = owiVar4;
        owi owiVar5 = new owi("EXECUTE_CAMERA_ON_OFF", 4, "device.execute.camera_onoff");
        e = owiVar5;
        owi owiVar6 = new owi("READ_CAMERA_HISTORY", 5, "device.read.camera_history");
        f = owiVar6;
        owi owiVar7 = new owi("MOVE_TO_ROOM", 6, "device.move.room");
        g = owiVar7;
        owi owiVar8 = new owi("READ_THERMOSTAT_ENERGY_HISTORY", 7, "device.read.thermostat_energyhistory");
        h = owiVar8;
        owi owiVar9 = new owi("EXECUTE_THERMOSTAT_SCHEDULE", 8, "device.execute.thermostat_schedule");
        i = owiVar9;
        owi owiVar10 = new owi("READ_THERMOSTAT_SCHEDULE", 9, "device.read.thermostat_schedule");
        j = owiVar10;
        owi owiVar11 = new owi("DELETE_DEVICE", 10, "device.delete");
        k = owiVar11;
        owi owiVar12 = new owi("MOVE_TO_STRUCTURE", 11, "device.move.structure");
        l = owiVar12;
        owi owiVar13 = new owi("UPDATE_LOCK_SETTINGS", 12, "device.update.lock_settings");
        m = owiVar13;
        owi[] owiVarArr = {owiVar, owiVar2, owiVar3, owiVar4, owiVar5, owiVar6, owiVar7, owiVar8, owiVar9, owiVar10, owiVar11, owiVar12, owiVar13};
        o = owiVarArr;
        agtw.a(owiVarArr);
    }

    private owi(String str, int i2, String str2) {
        this.n = str2;
    }

    public static owi[] values() {
        return (owi[]) o.clone();
    }
}
