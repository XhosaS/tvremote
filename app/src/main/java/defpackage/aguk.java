package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aguk {
    public static final Class a(agxd agxdVar) {
        agxdVar.getClass();
        return ((agvp) agxdVar).a();
    }

    public static final Class b(agxd agxdVar) {
        String name;
        agxdVar.getClass();
        Class clsA = ((agvp) agxdVar).a();
        if (!clsA.isPrimitive() || (name = clsA.getName()) == null) {
            return clsA;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : clsA;
            case 104431:
                return name.equals("int") ? Integer.class : clsA;
            case 3039496:
                return name.equals("byte") ? Byte.class : clsA;
            case 3052374:
                return name.equals("char") ? Character.class : clsA;
            case 3327612:
                return name.equals("long") ? Long.class : clsA;
            case 3625364:
                return name.equals("void") ? Void.class : clsA;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : clsA;
            case 97526364:
                return name.equals("float") ? Float.class : clsA;
            case 109413500:
                return name.equals("short") ? Short.class : clsA;
            default:
                return clsA;
        }
    }
}
