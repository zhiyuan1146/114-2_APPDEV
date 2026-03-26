class GiantSquid extends Creature {
    public String describe() { return "【大王烏賊】巨大的深海頭足類"; }
    public String kingdom() { return "動物界"; }
    public String move() { return "噴射推進"; }
    public String eat() { return "捕捉中型魚類"; }
}

class Anglerfish extends Creature {
    public String describe() { return "【鮟鱇魚】頭部有發光誘餌"; }
    public String kingdom() { return "動物界"; }
    public String move() { return "緩慢游泳"; }
    public String eat() { return "誘捕小型生物"; }
}

class SpermWhale extends Creature {
    public String describe() { return "【抹香鯨】深潛紀錄保持者"; }
    public String kingdom() { return "動物界"; }
    public String move() { return "強力的尾鰭擺動"; }
    public String eat() { return "吞食大型烏賊"; }
}

class TubeWorm extends Creature {
    public String describe() { return "【巨型管蟲】生活在熱泉噴口附近"; }
    public String kingdom() { return "動物界"; }
    public String move() { return "固著不動"; }
    public String eat() { return "依賴共生細菌提供養分"; }
}




abstract class Creature {
    public abstract String describe();
    public abstract String kingdom();
    public abstract String move();
    public abstract String eat();

    // 方法多載 (Overloading)
    public String feed() {
        return "正在餵食中...";
    }

    public String feed(String food) {
        return "餵食了 " + food;
    }

    public String feed(String food, int count) {
        return "餵食了 " + count + " 隻 " + food;
    }
}