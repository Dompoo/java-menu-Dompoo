package menu.io.output;

import menu.common.dto.MenuPickResults;
import menu.io.writer.Writer;

public class OutputHandler {
	
	private final Writer writer;
	private final OutputParser outputParser;
	
	public OutputHandler(Writer writer, OutputParser outputParser) {
		this.writer = writer;
		this.outputParser = outputParser;
	}
	
	public void handleGreetings() {
		writer.write("점심 메뉴 추천을 시작합니다.\n");
	}
	
	public void handleMenuPickResults(MenuPickResults menuPickResults) {
		String output = outputParser.parseMenuPickResults(menuPickResults);
		writer.write(output);
	}
}
